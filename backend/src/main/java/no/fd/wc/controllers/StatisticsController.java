package no.fd.wc.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import no.fd.wc.service.StatisticsService;
import no.fd.wc.service.pojo.Statistics;
import org.apache.commons.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author kjetilf
 */
@Controller
public class StatisticsController {

    @Autowired
    private Configuration configuration;

    @Autowired
    private StatisticsService statisticsService;
    
    @ResponseBody
    @RequestMapping(value = "/request/statistics", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Statistics getConfig(HttpServletResponse httpServletResponse) throws JsonProcessingException {
        return statisticsService.getStatistics();
    }

}
