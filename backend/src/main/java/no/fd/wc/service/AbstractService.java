package no.fd.wc.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import no.fd.wc.service.pojo.Ranking;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.io.input.BOMInputStream;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Kjetil
 */
public abstract class AbstractService {

    @Autowired
    private Configuration configuration;

    public Map<String, Integer> getGoalMap(File goalfile) throws IOException {
        Map<String, Integer> goalMap = new HashMap();
        Reader in = new InputStreamReader(new BOMInputStream(new FileInputStream(goalfile)), "UTF-8");
        Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
        Iterator<CSVRecord> iterator = records.iterator();
        iterator.next();
        while (iterator.hasNext()) {
            CSVRecord csvr = iterator.next();
            goalMap.put(csvr.get(0), Integer.valueOf(csvr.get(1)));
        }
        in.close();
        return goalMap;
    }

    public Ranking getRanking(File guessfile, Map<String, Integer> goalsPerTeam, Set<String> result16, Set<String> result8, Set<String> result4, Set<String> result2, Set<String> result1) throws UnsupportedEncodingException, FileNotFoundException, IOException {
        Ranking ranking = new Ranking();
        Reader in = new InputStreamReader(new BOMInputStream(new FileInputStream(guessfile)), "UTF-8");
        Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
        Iterator<CSVRecord> iterator = records.iterator();
        CSVRecord namerecord = iterator.next();
        ranking.setName(namerecord.get(1));
        iterator.next();
        int per16points = 0;
        int per8points = 0;
        int per4points = 0;
        int per2points = 0;
        int per1points = 0;
        int goalpoints = 0;
        while (iterator.hasNext()) {
            CSVRecord csvr = iterator.next();
            if (csvr.get(0) != null && csvr.get(0).length() > 0 && result16.contains(csvr.get(0))) {
                per16points += configuration.getInt("correct16points");
            }
            if (csvr.get(1) != null && csvr.get(1).length() > 0 && result8.contains(csvr.get(1))) {
                per8points += configuration.getInt("correct8points");
            }
            if (csvr.get(2) != null && csvr.get(2).length() > 0 && result4.contains(csvr.get(2))) {
                per4points += configuration.getInt("correct4points");
            }
            if (csvr.get(3) != null && csvr.get(3).length() > 0 && result2.contains(csvr.get(3))) {
                per2points += configuration.getInt("correct2points");
            }
            if (csvr.get(4) != null && csvr.get(4).length() > 0 && result1.contains(csvr.get(4))) {
                per1points += configuration.getInt("correct1points");
            }
            if (csvr.size() >= 6 && csvr.get(5) != null && csvr.get(5).length() > 0 && goalsPerTeam.containsKey(csvr.get(5))) {
                goalpoints += goalsPerTeam.get(csvr.get(5));
            }
        }
        ranking.setPer16points(per16points);
        ranking.setPer8points(per8points);
        ranking.setPer4points(per4points);
        ranking.setPer2points(per2points);
        ranking.setPer1points(per1points);
        ranking.setGoalpoints(goalpoints);
        ranking.setTotalpoints(per1points + per2points + per4points + per8points + per16points + goalpoints);
        in.close();
        return ranking;
    }
    
    public void fillResultSets(File resultfile, Set<String> result16, Set<String> result8, Set<String> result4, Set<String> result2, Set<String> result1) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        Reader in = new InputStreamReader(new BOMInputStream(new FileInputStream(resultfile)), "UTF-8");
        Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
        Iterator<CSVRecord> iterator = records.iterator();
        iterator.next();
        while (iterator.hasNext()) {
            CSVRecord csvr = iterator.next();
            if (csvr.size() >= 2 && csvr.get(1) != null && csvr.get(1).length() > 0) {
                result16.add(csvr.get(1));
            }
            if (csvr.size() >= 3 && csvr.get(2) != null && csvr.get(2).length() > 0) {
                result8.add(csvr.get(2));
            }
            if (csvr.size() >= 4 && csvr.get(3) != null && csvr.get(3).length() > 0) {
                result4.add(csvr.get(3));
            }
            if (csvr.size() >= 5 && csvr.get(4) != null && csvr.get(4).length() > 0) {
                result2.add(csvr.get(4));
            }   
            if (csvr.size() >= 6 && csvr.get(5) != null && csvr.get(5).length() > 0) {
                result1.add(csvr.get(5));
            }              
        }
        in.close();
    }    
}
