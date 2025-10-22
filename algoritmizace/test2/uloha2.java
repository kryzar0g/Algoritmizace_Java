import java.util.Scanner;
import java.util.Stack;

public class uloha2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> zasobnik = new Stack<>();

        int a;
        int count = 0;
        int sum = 0;
        double b;


        System.out.println("Zadejte cisla a zakoncete nulou pro ukonceni:");

        do {
            a = sc.nextInt();
            if (a != 0) {
                count++;
                sum += a;
                zasobnik.push(a);
            }
            
        } while (a != 0);
        b = (double) sum / count;
        System.out.printf("prumer: %.2f\n", b);

        System.out.println("cisla pozdpatku:");
        
        for (int i=0;i<count;i++){
            System.out.printf("%d\n", zasobnik.pop());
        }
    }
}


