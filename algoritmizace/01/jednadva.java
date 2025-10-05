import java.util.Scanner;
public class jednadva {
    public static double prevod(double a){
        double b = 2.2369;
        double vysledek = a*b;
        return vysledek;
    }
    public static void main(String args[]){
        System.out.printf("zadejte rychlost v m/s : \n");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextFloat();
        System.out.printf("prevedena hodnota v mp/h : %.2f\n",prevod(a));
    }
    
}
