import java.util.Scanner;

class DP16 
{ 
    public static void main(String args[])
    {    
        double a, b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();  
        b = sc.nextFloat(); 
        
        if (a>30  && b>170 && b<180) {
          System.out.printf("Zaradit.\n" );
        } else {
          System.out.printf("Nezarazovat.\n" );
        }

    }           
       
} 

