import java.util.Scanner;

class DP114
{ 
    // static int a, b ; 

    public static int max_ze_dvou(int a, int b)
    {   int x;
        if (a>b) x=a; else x=b;
        a=100; b=200;
        System.out.printf("2 a=%d b=%d \n", a, b);  // co se vytiskne ?
        return x;
    }

    /*
    public static void fn()
    {
        System.out.printf("4 a=%d b=%d \n", a, b);  // co se vytiskne ?
    }   
    */ 
    
    public static void main(String args[])
    {    
        int a=10, b=20, v;
        
        System.out.printf("1 a=%d b=%d \n", a, b);  // co se vytiskne ?
        v = max_ze_dvou(a, b);
        System.out.printf("vetsi je %d \n", v );               
        System.out.printf("3 a=%d b=%d \n", a, b);  // co se vytiskne ?

        // fn();
    }
        
} 

