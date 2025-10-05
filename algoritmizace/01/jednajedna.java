import java.lang.Math;

public class jednajedna {
    public static double vypocet(double a,double b){
        double c;
        c = Math.sqrt(((Math.pow(a,2))+(Math.pow(b,2))));
        return c;
    }
    public static void main(String args[]){
        double a,b;
        a= 3;
        b =4;
        double prepona = vypocet(a,b);
        System.out.printf("delka prepodny je: %.4f \n",prepona);
        
    }
}
