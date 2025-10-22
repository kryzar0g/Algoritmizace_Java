import java.util.ArrayDeque;
import java.util.Scanner;
public class fronta {
    public static void main(String args[]){
        ArrayDeque<Integer> fronta = new ArrayDeque<>();
        int volba;
        Scanner sc = new Scanner(System.in);

        do{
        System.out.println("\n");
        System.out.println("1 - pridej objednavku\n");
        System.out.println("2 - zpracovani objednavky\n");
        System.out.println("3 - zobrazit frontu\n");
        System.out.println("4 - konec\n");
        System.out.print("Zadej volbu: \t");
        volba = sc.nextInt();
        int objednavka;
        
        switch(volba){
            case 1:
            System.out.print("Zadej cislo objednavky: \t");
            objednavka = sc.nextInt();
            fronta.offer(objednavka);
            break;

            case 2:
            System.out.println("Zpracovana prvni objednavka cislo: \n"+fronta.poll());
            break;

            case 3:
            System.out.printf("obsah fronty: \n");
            for (int i:fronta){
                System.out.printf("%d\n", i);
            }
            break;

            case 4:
            System.out.println("Konec");
            break;

            default:
            System.out.println("Neplatná volba");
            break;
        }
    }
    while (volba !=4);
    sc.close();
        

    }
}
