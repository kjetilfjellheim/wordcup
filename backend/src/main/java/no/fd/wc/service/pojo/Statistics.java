
package no.fd.wc.service.pojo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kjetil
 */
public class Statistics {
    private Map<String, Integer> perCountry16 = new HashMap();
    private Map<String, Integer> perCountry8 = new HashMap();
    private Map<String, Integer> perCountry4 = new HashMap();
    private Map<String, Integer> perCountry2 = new HashMap();
    private Map<String, Integer> perCountry1 = new HashMap();

    public Map<String, Integer> getPerCountry16() {
        return perCountry16;
    }

    public void setPerCountry16(Map<String, Integer> perCountry16) {
        this.perCountry16 = perCountry16;
    }

    public Map<String, Integer> getPerCountry8() {
        return perCountry8;
    }

    public void setPerCountry8(Map<String, Integer> perCountry8) {
        this.perCountry8 = perCountry8;
    }

    public Map<String, Integer> getPerCountry4() {
        return perCountry4;
    }

    public void setPerCountry4(Map<String, Integer> perCountry4) {
        this.perCountry4 = perCountry4;
    }

    public Map<String, Integer> getPerCountry2() {
        return perCountry2;
    }

    public void setPerCountry2(Map<String, Integer> perCountry2) {
        this.perCountry2 = perCountry2;
    }

    public Map<String, Integer> getPerCountry1() {
        return perCountry1;
    }

    public void setPerCountry1(Map<String, Integer> perCountry1) {
        this.perCountry1 = perCountry1;
    }
    
    
}
