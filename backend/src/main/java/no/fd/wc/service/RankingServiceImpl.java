package no.fd.wc.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
public class RankingServiceImpl extends AbstractService implements RankingService {

    /**
     * Class logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(RankingServiceImpl.class);

    @Autowired
    private Configuration configuration;

    private List<Ranking> ranking = new ArrayList();

    @Scheduled(fixedRate = 60000)
    public void generateRanking() throws UnsupportedEncodingException, IOException {
        List<Ranking> newranking = new ArrayList();
        String workdir = configuration.getString("workdir");
        File resultfile = new File(workdir + File.separatorChar + configuration.getString("resultfile"));
        File goalfile = new File(workdir + File.separatorChar + configuration.getString("goalfile"));
        Set<String> result16 = new HashSet();
        Set<String> result8 = new HashSet();
        Set<String> result4 = new HashSet();
        Set<String> result2 = new HashSet();
        Set<String> result1 = new HashSet();
        Map<String, Integer> goalsPerTeam = getGoalMap(goalfile);
        fillResultSets(resultfile, result16, result8, result4, result2, result1);
        for (File guessfile : (new File(workdir)).listFiles()) {
            if (guessfile.getName().startsWith(configuration.getString("guess.pre"))) {
                newranking.add(getRanking(guessfile, goalsPerTeam, result16, result8, result4, result2, result1));
            }
        }
        Collections.sort(newranking, new Comparator<Ranking>() {
            public int compare(Ranking o1, Ranking o2) {
                return o2.getTotalpoints() - o1.getTotalpoints();
            }            
        });
        int prevpoints = Integer.MAX_VALUE;
        int prevranking = 1;
        int index = 0;
        for (Ranking ranking : newranking) {
            index++;
            if (ranking.getTotalpoints() == prevpoints ) {
                ranking.setRank(prevranking);
            } else {
                ranking.setRank(index);
                prevranking = index;
                prevpoints = ranking.getTotalpoints();
            }            
        }
        this.ranking = newranking;
    }

    public List<Ranking> getRanking() {
        return ranking;
    }    

}
