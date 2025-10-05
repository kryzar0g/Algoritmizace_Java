import java.util.Scanner;

class DP11_varianta2
{ 
    public static void main(String args[])
    {    
        double polomer=1.0, obvod;
        
        System.out.printf("Vlozte polomer:");
        try (Scanner sc = new Scanner(System.in)) {        
            polomer = sc.nextFloat(); 

        } catch (Exception e) { 
            System.out.printf("Chyba vstupu, ponecham vychozi hodnotu polomeru %f\n", polomer);
            
        }

        obvod = 2 * Math.PI * polomer ;
        System.out.printf("obvod je %f \n", obvod );

    }           
       
} 

