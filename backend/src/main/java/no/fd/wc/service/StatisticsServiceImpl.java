package no.fd.wc.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import no.fd.wc.service.pojo.Statistics;
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
public class StatisticsServiceImpl extends AbstractService implements StatisticsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StatisticsServiceImpl.class);

    @Autowired
    private Configuration configuration;

    private Statistics statistics = new Statistics();

    public Statistics getStatistics() {
        return statistics;
    }

    @Scheduled(fixedRate = 360000)
    public void generateStatistics() throws IOException {
        Statistics newStatistics = new Statistics();
        String workdir = configuration.getString("workdir");
        File resultfile = new File(workdir + File.separatorChar + configuration.getString("resultfile"));                         
        initCountriesStatistics(resultfile, newStatistics);
        for (File guessfile : (new File(workdir)).listFiles()) {
            if (guessfile.getName().startsWith(configuration.getString("guess.pre"))) {
                appendStatistics(guessfile, newStatistics);
            }
        }
        this.statistics = newStatistics;
    }

    private void appendStatistics(File guessfile, Statistics newStatistics) throws FileNotFoundException, IOException {
        Reader in = new InputStreamReader(new BOMInputStream(new FileInputStream(guessfile)), "UTF-8");
        Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
        Iterator<CSVRecord> iterator = records.iterator(); 
        iterator.next();
        iterator.next();
        while(iterator.hasNext()) {
            CSVRecord csvr = iterator.next();
            if (csvr.size() >= 1 && newStatistics.getPerCountry16().get(csvr.get(0)) != null) {
                add(newStatistics.getPerCountry16(), csvr.get(0), newStatistics.getPerCountry16().get(csvr.get(0)) + 1);
            }
            if (csvr.size() >= 2 && newStatistics.getPerCountry8().get(csvr.get(1)) != null) {
                add(newStatistics.getPerCountry8(), csvr.get(1), newStatistics.getPerCountry8().get(csvr.get(1)) + 1);
            }
            if (csvr.size() >= 3 && newStatistics.getPerCountry4().get(csvr.get(2)) != null) {            
                add(newStatistics.getPerCountry4(), csvr.get(2), newStatistics.getPerCountry4().get(csvr.get(2)) + 1);
            }
            if (csvr.size() >= 4 && newStatistics.getPerCountry2().get(csvr.get(3)) != null) {
                add(newStatistics.getPerCountry2(), csvr.get(3), newStatistics.getPerCountry2().get(csvr.get(3)) + 1);
            }
            if (csvr.size() >= 5 && newStatistics.getPerCountry1().get(csvr.get(4)) != null) {
                add(newStatistics.getPerCountry1(), csvr.get(4), newStatistics.getPerCountry1().get(csvr.get(4)) + 1);
            }
        }
    }

    private void initCountriesStatistics(File resultfile, Statistics newStatistics) throws IOException {
        Reader in = new InputStreamReader(new BOMInputStream(new FileInputStream(resultfile)), "UTF-8");        
        Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
        Iterator<CSVRecord> iterator = records.iterator();
        iterator.next();
        while(iterator.hasNext()) {
            CSVRecord csvr = iterator.next();
            newStatistics.getPerCountry16().put(csvr.get(0), 0);
            newStatistics.getPerCountry8().put(csvr.get(0), 0);
            newStatistics.getPerCountry4().put(csvr.get(0), 0);
            newStatistics.getPerCountry2().put(csvr.get(0), 0);
            newStatistics.getPerCountry1().put(csvr.get(0), 0);
        }
        in.close();
    }

    private void add(Map<String, Integer> perCountry, String country, Integer newValue) {
        if (country != null && country.length() > 0) {
            perCountry.put(country, newValue);
        }
    }

}
