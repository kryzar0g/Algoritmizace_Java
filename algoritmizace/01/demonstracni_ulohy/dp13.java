import java.util.Scanner;

class DP13
{ 
    public static void main(String args[])
    {    
        double H, R, objem;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Vlozte vysku valce H:");
        H = sc.nextFloat();
        System.out.print("Vlozte polomer podstavy R:");
        R = sc.nextFloat();

        objem = Math.PI * R*R * H;
  
        System.out.printf("Objem nadoby je %f \n", objem);

    }           
       
} 

