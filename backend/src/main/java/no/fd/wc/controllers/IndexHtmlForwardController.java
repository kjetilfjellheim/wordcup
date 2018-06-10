
package no.fd.wc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author kjetilf
 */
@Controller
public class IndexHtmlForwardController {

    @RequestMapping({"", "/rangering", "/spillere", "/informasjon", "/statistikk"})
    public String index() {
        return "forward:/index.html";
    }

}
