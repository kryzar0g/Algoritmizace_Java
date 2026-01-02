import java.util.*;


public class ManagementSystem {
    private final Map<Station, List<Connection>> adj = new HashMap<>();

    public void addStation(Station s) {
        adj.computeIfAbsent(s, k -> new ArrayList<>());
    }

    public void addConnection(Connection c) {
        addStation(c.getFrom());
        addStation(c.getTo());
        adj.get(c.getFrom()).add(c);
    }

    public void performDijkstra(Station source) {
        dijkstra(source, true);  

        dijkstra(source, false); 
    }

    private void dijkstra(Station source, boolean byTime) {
        for (Station s : adj.keySet()) {
            if (byTime) {
                s.setTimeDist(Integer.MAX_VALUE);
                s.setPrevTime(null);
            } else {
                s.setCostDist(Integer.MAX_VALUE);
                s.setPrevCost(null);
            }
        }

        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.dist));

        if (byTime) {
            source.setTimeDist(0);
            pq.offer(new Node(source, 0));
        } else {
            source.setCostDist(0);
            pq.offer(new Node(source, 0));
        }

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            Station u = cur.station;

            int knownDist = byTime ? u.getTimeDist() : u.getCostDist();
            if (cur.dist != knownDist) continue;   

            for (Connection e : adj.getOrDefault(u, Collections.emptyList())) {
                Station v = e.getTo();
                int weight = byTime ? e.getTime() : e.getCost();

                
                if (byTime) {
                    int newDist = u.getTimeDist() + weight;
                    if (newDist < v.getTimeDist()) {
                        v.setTimeDist(newDist);
                        v.setPrevTime(u);
                        pq.offer(new Node(v, newDist));
                    }
                } else {
                    int newDist = u.getCostDist() + weight;
                    if (newDist < v.getCostDist()) {
                        v.setCostDist(newDist);
                        v.setPrevCost(u);
                        pq.offer(new Node(v, newDist));
                    }
                }
            }
        }
    }

    private static class Node {
        final Station station;
        final int dist;
        Node(Station station, int dist) {
            this.station = station;
            this.dist = dist;
        }
    }

    
    public void printFastestPath(Station destination, Station source) {
        List<Station> path = reconstructPath(destination, source, true);
        if (path == null) {
            System.out.println("No fastest path from " + source + " to " + destination);
            return;
        }
        System.out.println(joinPath(path));
    }

    public void printCheapestPath(Station destination, Station source) {
        List<Station> path = reconstructPath(destination, source, false);
        if (path == null) {
            System.out.println("No cheapest path from " + source + " to " + destination);
            return;
        }
        System.out.println(joinPath(path));
    }

    private List<Station> reconstructPath(Station destination, Station source, boolean byTime) {
        List<Station> rev = new ArrayList<>();
        Station cur = destination;
        while (cur != null && cur != source) {
            rev.add(cur);
            cur = byTime ? cur.getPrevTime() : cur.getPrevCost();
        }
        if (cur == null) return null;   
        rev.add(source);
        Collections.reverse(rev);
        return rev;
    }

    private String joinPath(List<Station> path) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < path.size(); i++) {
            sb.append(path.get(i).getName());
            if (i < path.size() - 1) sb.append(" -> ");
        }
        return sb.toString();
    }

    
    public void printReachable(int maxTime) {
        System.out.println("Reachable within " + maxTime + " minutes:");
        for (Station s : adj.keySet()) {
            int t = s.getTimeDist();
            if (t <= maxTime) {
                System.out.println("- " + s.getName() + " (time=" + t + ", cost=" + s.getCost() + ")");
            }
        }
    }
}
