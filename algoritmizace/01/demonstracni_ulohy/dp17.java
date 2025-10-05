import java.util.Scanner;

class DP17
{ 
    public static void main(String args[])
    {    
      
        System.out.print("Vlozte pismenko znamky: ");
        
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        System.out.println("vlozeno "+c);

        switch (c) {

            case 'A': System.out.println("vyborne"); break;
            case 'B': System.out.println("velmi dobre"); break;
            case 'C': System.out.println("dobre"); break;
            case 'D': System.out.println("uspokojive"); break;
            case 'E': System.out.println("dostatecne"); break;
            case 'F': System.out.println("neprospel"); break;
            default:  System.out.println("neznama znamka");

        }    

    }           
       
} 

