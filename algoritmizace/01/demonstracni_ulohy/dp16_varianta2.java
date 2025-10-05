import java.util.Scanner;

class DP16_varianta2 
{ 
    public static void main(String args[])
    {    
        double a, b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();  
        b = sc.nextFloat(); 
        
        boolean P = a>30  && b>170 && b<180 ;

        if ( P ) {
          System.out.printf("Zaradit.\n" );
        } else {
          System.out.printf("Nezarazovat.\n" );
        }

    }           
       
} 

