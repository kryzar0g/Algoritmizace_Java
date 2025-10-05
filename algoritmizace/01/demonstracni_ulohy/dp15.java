import java.util.Scanner;

class DP15
{ 
    public static void main(String args[])
    {    
        float polomer, obvod;

        System.out.printf("Vlozte polomer:");

        Scanner sc = new Scanner(System.in);

        polomer = sc.nextFloat();

        if (polomer > 0) {
            obvod = 2 * (float)Math.PI * polomer ;
            System.out.printf("obvod je %f \n", obvod );
        } else {
            System.out.println("Chybny polomer" );

        }

    }           
       
} 


