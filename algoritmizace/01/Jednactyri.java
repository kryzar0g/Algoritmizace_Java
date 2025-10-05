import java.util.Scanner;
public class Jednactyri {
    public static void main(String args[]){
        double a,b,c;
        Scanner sc=new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double max;

        if (a >= b && a >= c) {
            max = a;
            if ((max*max == (b*b + c*c))) {
                System.out.println("Muze to byt pravouhly trojuhelnik.");
            } else {
                System.out.println("Neni to pravouhly trojuhelnik.");
            }
        } else if (b >= a && b >= c) {
            max = b;
            if ((max*max ==(a*a + c*c))) {
                System.out.println("Muze to byt pravouhly trojuhelnik.");
            } else {
                System.out.println("Neni to pravouhly trojuhelnik.");
            }
        } else {
            max = c;
            if ((max*max == (a*a + b*b))) {
                System.out.println("Muze to byt pravouhly trojuhelnik.");
            } else {
                System.out.println("Neni to pravouhly trojuhelnik.");
            }
        }

    }

}
