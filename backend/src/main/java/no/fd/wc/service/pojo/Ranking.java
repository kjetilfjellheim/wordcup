
package no.fd.wc.service.pojo;

/**
 *
 * @author Kjetil
 */
public class Ranking {
    private int rank;
    private int totalpoints;
    private int per16points;
    private int per8points;
    private int per4points;
    private int per2points;
    private int per1points;
    private int goalpoints;
    private String name;

    public int getGoalpoints() {
        return goalpoints;
    }

    public void setGoalpoints(int goalpoints) {
        this.goalpoints = goalpoints;
    }    
    
    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }    
    
    public int getTotalpoints() {
        return totalpoints;
    }

    public void setTotalpoints(int totalpoints) {
        this.totalpoints = totalpoints;
    }

    public int getPer16points() {
        return per16points;
    }

    public void setPer16points(int per16points) {
        this.per16points = per16points;
    }

    public int getPer8points() {
        return per8points;
    }

    public void setPer8points(int per8points) {
        this.per8points = per8points;
    }

    public int getPer4points() {
        return per4points;
    }

    public void setPer4points(int per4points) {
        this.per4points = per4points;
    }

    public int getPer2points() {
        return per2points;
    }

    public void setPer2points(int per2points) {
        this.per2points = per2points;
    }

    public int getPer1points() {
        return per1points;
    }

    public void setPer1points(int per1points) {
        this.per1points = per1points;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
