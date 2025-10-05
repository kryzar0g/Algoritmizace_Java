import java.util.Scanner;

class DP12
{ 
    public static void main(String args[])
    {    
        float R1, R2, R;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Vlozte R1:");
        R1 = sc.nextFloat();
        System.out.print("Vlozte R2:");
        R2 = sc.nextFloat();

        R = R1*R2 / (R1 + R2) ;
  
        System.out.printf("Odpor paralelni kombinace R1 a R2 je %f Ohmu\n", R );

    }           
       
} 

