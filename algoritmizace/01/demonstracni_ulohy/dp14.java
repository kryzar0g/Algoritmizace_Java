import java.util.Scanner;

class DP14 
{ 
    public static void main(String args[])
    {    
        double H, R, M, objem;

        Scanner sc = new Scanner(System.in);
        H = sc.nextFloat();  
        R = sc.nextFloat(); 
        M = sc.nextFloat();

        objem = Math.PI * R*R * H;
        System.out.printf("Fyzicky objem je %f, pozadovany je %f\n", objem, M);

        if (objem < M) {
          System.out.printf("Nevejde se.\n" );
        } else {
          System.out.printf("Vejde se.\n" );
        }

    }           
       
} 

