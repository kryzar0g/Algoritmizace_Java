import java.nio.channels.Pipe;
import java.util.Scanner;
public class vypocet_obvodu {
   public static void main(String args[]){
        float polomer,obvod;
        char volba;
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte 'p' pokud znate polomer, 'o' pokud znate obvod: ");
        volba = sc.next().charAt(0);
 
        switch (volba) {
            case 'p':
                System.out.println("Zadejte polomer kruhu: ");
                polomer = sc.nextFloat();
                obvod = 2*3.14f*polomer;
                System.out.println("Obvod kruhu je: " + obvod);
                break;
            case 'o':
                System.out.println("Zadejte obvod kruhu: ");
                obvod = sc.nextFloat();
                polomer = obvod/(2*3.14f);
                System.out.println("Polomer kruhu je: " + polomer);
                break;
            default:
                throw new AssertionError();

        }

   } 
}
