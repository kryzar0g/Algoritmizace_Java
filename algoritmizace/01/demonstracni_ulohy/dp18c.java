import java.util.Scanner;

class DP18C
{ 
    public static void main(String args[])
    {    
        int N, P;  double V, a;

        V=0; P=0; // není nutné, jsou automaticky nulovány

        Scanner sc = new Scanner(System.in);

        System.out.print("Vlozte pocet cisel: ");
        N = sc.nextInt(); 

        while ( P<N ) {
              System.out.printf("Vlozte cislo " + (P+1) + ": ");
              a = sc.nextFloat();  

              V=V+a; P=P+1;

        }

        V = V / N;
        System.out.printf("Prumer je %.2f\n", V);       

    }           
       
} 