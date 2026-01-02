
public class Main {
    public static void main(String[] args) {
        Station praha      = new Station("Praha");
        Station rokycany   = new Station("Rokycany");
        Station plzen      = new Station("Plzen");
        Station ostrava    = new Station("Ostrava");
        Station brno       = new Station("Brno");
        Station budejovice = new Station("Ceske_Budejovice");
        Station strakonice = new Station("Strakonice");
        Station usti       = new Station("Usti");

        ManagementSystem ms = new ManagementSystem();

        ms.addConnection(new Connection(rokycany, praha, 60, 200));
        ms.addConnection(new Connection(plzen, praha, 70, 100));
        ms.addConnection(new Connection(rokycany, plzen, 10, 20));
        ms.addConnection(new Connection(praha, ostrava, 120, 100));
        ms.addConnection(new Connection(praha, strakonice, 60, 10));
        ms.addConnection(new Connection(strakonice, praha, 60, 10));
        ms.addConnection(new Connection(praha, budejovice, 100, 5));
        ms.addConnection(new Connection(ostrava, praha, 60, 100));
        ms.addConnection(new Connection(ostrava, brno, 180, 200));
        ms.addConnection(new Connection(brno, ostrava, 180, 1));
        ms.addConnection(new Connection(budejovice, brno, 600, 5));
        ms.addConnection(new Connection(usti, plzen, 120, 10));
        ms.addConnection(new Connection(plzen, usti, 120, 10));
        ms.addConnection(new Connection(strakonice, plzen, 60, 10));

  
        ms.performDijkstra(praha);

        System.out.println("Fastest (Praha -> Rokycany):");
        ms.printFastestPath(rokycany, praha);
        System.out.println("Cheapest (Praha -> Rokycany):");
        ms.printCheapestPath(rokycany, praha);
        System.out.println();

        System.out.println("Fastest (Praha -> Brno):");
        ms.printFastestPath(brno, praha);
        System.out.println("Cheapest (Praha -> Brno):");
        ms.printCheapestPath(brno, praha);
        System.out.println();

        System.out.println("cas (Praha ->Brno): " + brno.getTime() + " min");
        System.out.println("cena (Praha ->Brno): " + brno.getCost() + " Kc");
        System.out.println();

        ms.printReachable(150);
    }
}
