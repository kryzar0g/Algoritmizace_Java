import java.util.Scanner;

class DP1_12 
{ 
    public static void main(String args[])
    {    
        int a, nejvetsi, pocet=0;

        nejvetsi = -2;

        Scanner sc = new Scanner(System.in);
        
        do {
              System.out.print("Vlozte cislo :" );
              a = sc.nextInt();  

              if ( a > nejvetsi ) { nejvetsi = a; }
              pocet++;

        } while ( a != -1 ) ;

        if (pocet > 1)
        { System.out.printf("Nejvetsi bylo %d\n", nejvetsi); }
        else { System.out.println("Nebylo vlozeno ani jedno cislo"); }

    }           
       
} 

