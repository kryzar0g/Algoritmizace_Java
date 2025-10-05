import java.util.Scanner;

class DP18A 
{ 
    public static void main(String args[])
    {    
        double a,b,c, prumer;

        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();  
        b = sc.nextFloat(); 
        c = sc.nextFloat();

        prumer = (a + b + c )/ 3;
        System.out.printf("Prumer je %f\n", prumer);

       

    }           
       
} 

