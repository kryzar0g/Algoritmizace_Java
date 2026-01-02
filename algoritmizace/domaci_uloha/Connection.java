
public class Connection {
    private final Station from;
    private final Station to;
    private final int time;   
    private final int cost;   

    public Connection(Station from, Station to, int time, int cost) {
        this.from = from;
        this.to   = to;
        this.time = time;
        this.cost = cost;
    }

    public Station getFrom() { return from; }
    public Station getTo()   { return to;   }

    public int getTime() { return time; }
    public int getCost() { return cost; }

    @Override
    public String toString() {
        return from + " -> " + to + " (time=" + time + ", cost=" + cost + ")";
    }
}
