import java.util.ArrayList;
import java.util.Scanner;

public class uloha1 {

    public static void main(String[] args) {

        ArrayList<Integer> arrlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int a;
        int b;


        System.out.println("Zadejte cisla a zakoncete nulou pro ukonceni:");

        do {
            a = sc.nextInt();
            arrlist.add(a);
        } while (a != 0);
        System.out.println("Zadejte nasobek:");
        b = sc.nextInt();
        System.out.println("zadana cisla:");
        for (int i = 0; i < arrlist.size() - 1; i++) {
            System.out.println(arrlist.get(i));
        }
        System.out.println("cisla nasobku");
        for (int i = 0; i < arrlist.size() - 1; i++) {
            System.out.println(arrlist.get(i) * b);
        }
    }
}


