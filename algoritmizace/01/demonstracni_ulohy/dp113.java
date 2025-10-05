import java.util.Scanner;
//import java.io.File;


class Vypocty {

    public int max_ze_dvou(int a, int b)
    {
        if (a>b) return a; else return b;

    }
    
}


class DP1_13
{ 
    public static int max_ze_dvou(int a, int b)
    {
        if (a>b) return a; else return b;

    }

    public static void main(String args[])
    {    
        int a, b;
        
        System.out.print("Vlozte 2 cela cisla: "); 
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); b = sc.nextInt();
     
        System.out.printf("vlozeno a=%d b=%d \n", a, b);
        System.out.printf("vetsi je %d \n", max_ze_dvou(a, b) );

        Vypocty v = new Vypocty();
        System.out.printf("vetsi je %d \n", v.max_ze_dvou(a, b) );
       

    }
        
} 

