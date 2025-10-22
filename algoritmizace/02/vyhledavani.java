import java.util.Scanner;

public class vyhledavani {
    public static void main(String args[]){
        int[] pole = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49};
        Scanner sc = new Scanner(System.in);
        int hledane;
        boolean nalezeno = false;
        for (int i=0;i<pole.length;i++){
            System.out.printf("%d ", pole[i]);
        }
        System.out.print("Zadej hledane cislo: \t");
        hledane = sc.nextInt();
        
        for (int i=0;i<pole.length;i++){
            if (pole[i]==hledane){
                nalezeno = true;
                System.out.printf("Cislo %d je na pozici %d \n", hledane, i+1);
                break;
            }
            if (i==pole.length-1){
                System.out.printf("Cislo %d neni v poli \n", hledane);
            }
        }

    }
}
