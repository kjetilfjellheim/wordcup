package no.fd.wc.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import no.fd.wc.service.PlayerService;
import no.fd.wc.service.RankingService;
import no.fd.wc.service.pojo.Player;
import no.fd.wc.service.pojo.Ranking;
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
public class PlayerController {
    
    @Autowired
    private PlayerService playerService;
    
    @ResponseBody
    @RequestMapping(value = "/request/players", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Player> getConfig(HttpServletResponse httpServletResponse) throws JsonProcessingException {
        return playerService.getPlayers();
    }

}
