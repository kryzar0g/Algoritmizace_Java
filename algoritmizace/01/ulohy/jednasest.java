import java.util.Scanner;

public class jednasest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c;
        int a = 0; 
        int b = 0; 

        System.out.println("Zadejte cisla a zakoncete nulou pro ukonceni:");

        do {
            c = sc.nextInt();
            a = a + 1;
            if ((c % 2 != 0) && (c % 3 == 0)) {
                b = b + 1;
            }
        } while (c != 0);

        System.out.printf("Pocet cisel je: %d\n", a);
        System.out.printf("Pocet lichych cisel a delitelnych tremi je: %d\n", b);
    }
}
