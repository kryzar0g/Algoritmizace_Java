import java.util.Scanner;

class DP18D
{ 
    public static void main(String args[])
    {    
        int N, P;  double V, a;

        V=0;  // není nutné, jsou automaticky nulovány

        Scanner sc = new Scanner(System.in);

        System.out.print("Vlozte pocet cisel: ");
        N = sc.nextInt(); 

        for (P=0; P<N; P++)
        {
              System.out.printf("Vlozte cislo " + (P+1) + ": ");
              a = sc.nextFloat();  

              V=V+a; 

        }

        V = V / N;
        System.out.printf("Prumer je %.2f\n", V);       

    }           
       
} 