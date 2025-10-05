import java.util.Scanner;

class DP11
{ 
    public static void main(String args[])
    {    
        float polomer, obvod;

        System.out.printf("Vlozte polomer:");

        Scanner sc = new Scanner(System.in);
        polomer = sc.nextFloat();

        obvod = 2 * (float)Math.PI * polomer ;
  
        System.out.printf("obvod je %f \n", obvod );
        
        sc.close();

    }           
       
} 

