package no.fd.wc.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import no.fd.wc.service.pojo.Player;
import no.fd.wc.service.pojo.Ranking;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.io.input.BOMInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 *
 * @author kjetilf
 */
@Service
public class PlayerServiceImpl extends AbstractService implements PlayerService {

    /**
     * Class logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerServiceImpl.class);

    @Autowired
    private Configuration configuration;

    private List<Player> players = new ArrayList();

    @Scheduled(fixedRate = 300000)
    public void generatePlayerInfo() throws UnsupportedEncodingException, IOException {
        List<Player> newplayers = new ArrayList();
        String workdir = configuration.getString("workdir");
        File resultfile = new File(workdir + File.separatorChar + configuration.getString("resultfile"));
        File goalfile = new File(workdir + File.separatorChar + configuration.getString("goalfile"));
        Set<String> result16 = new HashSet();
        Set<String> result8 = new HashSet();
        Set<String> result4 = new HashSet();
        Set<String> result2 = new HashSet();
        Set<String> result1 = new HashSet();
        fillResultSets(resultfile, result16, result8, result4, result2, result1);        
        Map<String, Integer> goalMapFile = getGoalMap(goalfile);
        for (File guessfile : (new File(workdir)).listFiles()) {
            if (guessfile.getName().startsWith(configuration.getString("guess.pre"))) {
                Ranking ranking = getRanking(guessfile, goalMapFile, result16, result8, result4, result2, result1);
                Player player = new Player();
                player.setName(ranking.getName());
                player.setGoalPoints(ranking.getGoalpoints());
                fillPlayerInfo(guessfile, player);
                updatePlayerInfo(player, result16, result8, result4, result2, result1);
                newplayers.add(player);
            }
        }        
        this.players = newplayers;
    }

    public List<Player> getPlayers() {
        return players;
    }

    private void fillPlayerInfo(File guessfile, Player player) throws UnsupportedEncodingException, FileNotFoundException, IOException {
        Reader in = new InputStreamReader(new BOMInputStream(new FileInputStream(guessfile)), "UTF-8");
        Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
        Iterator<CSVRecord> iterator = records.iterator(); 
        iterator.next();
        iterator.next();
        while(iterator.hasNext()) {
            CSVRecord csvr = iterator.next();
            if (csvr.size() >= 1) {
                if (csvr.get(0).length() > 0) {
                    player.getPer16Countries().put(csvr.get(0), null);
                }
            }
            if (csvr.size() >= 2) {
                if (csvr.get(1).length() > 0) {
                    player.getPer8Countries().put(csvr.get(1), null);
                }
            }
            if (csvr.size() >= 3) { 
                if (csvr.get(2).length() > 0) {
                    player.getPer4Countries().put(csvr.get(2), null);
                }
            }
            if (csvr.size() >= 4) {
                if (csvr.get(3).length() > 0) {
                    player.getPer2Countries().put(csvr.get(3), null);
                }
            }
            if (csvr.size() >= 5) {
                if (csvr.get(4).length() > 0) {
                    player.getPer1Countries().put(csvr.get(4), null);
                }
            }
        }    
        in.close();
    }  

    private void updatePlayerInfo(Player player, Set<String> result16, Set<String> result8, Set<String> result4, Set<String> result2, Set<String> result1) {
        for (Entry<String,Boolean> entry : player.getPer16Countries().entrySet()) {
             player.getPer16Countries().put(entry.getKey(), result16.contains(entry.getKey()));
        }
        for (Entry<String,Boolean> entry : player.getPer8Countries().entrySet()) {
             player.getPer8Countries().put(entry.getKey(), result8.contains(entry.getKey()));
        }
        for (Entry<String,Boolean> entry : player.getPer4Countries().entrySet()) {
             player.getPer4Countries().put(entry.getKey(), result4.contains(entry.getKey()));
        }
        for (Entry<String,Boolean> entry : player.getPer2Countries().entrySet()) {
             player.getPer2Countries().put(entry.getKey(), result2.contains(entry.getKey()));
        }
        for (Entry<String,Boolean> entry : player.getPer1Countries().entrySet()) {
             player.getPer1Countries().put(entry.getKey(), result1.contains(entry.getKey()));
        }        
    }
    
}
