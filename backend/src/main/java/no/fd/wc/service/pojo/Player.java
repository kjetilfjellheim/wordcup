
package no.fd.wc.service.pojo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kjetil
 */
public class Player {
    private String name;
    private Map<String, Boolean> per16Countries = new HashMap();
    private Map<String, Boolean> per8Countries = new HashMap();
    private Map<String, Boolean> per4Countries = new HashMap();
    private Map<String, Boolean> per2Countries = new HashMap();
    private Map<String, Boolean> per1Countries = new HashMap();    
    private Integer goalPoints = 0;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGoalPoints() {
        return goalPoints;
    }

    public void setGoalPoints(Integer goalPoints) {
        this.goalPoints = goalPoints;
    }      

    public Map<String, Boolean> getPer16Countries() {
        return per16Countries;
    }

    public void setPer16Countries(Map<String, Boolean> per16Countries) {
        this.per16Countries = per16Countries;
    }

    public Map<String, Boolean> getPer8Countries() {
        return per8Countries;
    }

    public void setPer8Countries(Map<String, Boolean> per8Countries) {
        this.per8Countries = per8Countries;
    }

    public Map<String, Boolean> getPer4Countries() {
        return per4Countries;
    }

    public void setPer4Countries(Map<String, Boolean> per4Countries) {
        this.per4Countries = per4Countries;
    }

    public Map<String, Boolean> getPer2Countries() {
        return per2Countries;
    }

    public void setPer2Countries(Map<String, Boolean> per2Countries) {
        this.per2Countries = per2Countries;
    }

    public Map<String, Boolean> getPer1Countries() {
        return per1Countries;
    }

    public void setPer1Countries(Map<String, Boolean> per1Countries) {
        this.per1Countries = per1Countries;
    }
    
}


