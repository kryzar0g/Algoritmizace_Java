import java.util.Objects;

public class Station {
    private final String name;

    private int timeDist = Integer.MAX_VALUE;  
    private int costDist = Integer.MAX_VALUE;   
    private Station prevTime = null;            
    private Station prevCost = null;           

    public Station(String name) {
        this.name = name;
    }

    public int getCost() {
        return costDist == Integer.MAX_VALUE ? -1 : costDist;
    }

    public int getTime() {
        return timeDist == Integer.MAX_VALUE ? -1 : timeDist;
    }

    public String getName() {
        return name;
    }

    void setTimeDist(int d) { this.timeDist = d; }
    void setCostDist(int d) { this.costDist = d; }
    void setPrevTime(Station s) { this.prevTime = s; }
    void setPrevCost(Station s) { this.prevCost = s; }

    int getTimeDist() { return timeDist; }
    int getCostDist() { return costDist; }

    Station getPrevTime() { return prevTime; }
    Station getPrevCost() { return prevCost; }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Station)) return false;
        Station station = (Station) o;
        return Objects.equals(name, station.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
