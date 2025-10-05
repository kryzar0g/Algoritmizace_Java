import java.util.Scanner;

public class jednapet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, d, x, y, x1, x2;

        System.out.println("Zadejte koeficienty kvadraticke rovnice oddelene mezerou:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a == 0 && b == 0) {
            System.out.println("Degenerovana rovnice");
            return;
        } else if (a == 0) {
            x = -c / b;
            System.out.printf("Jednoduchy koren: %f\n", x);
        } else if (c == 0) {
            y = -b / a;
            System.out.printf("Kvadraticka rovnice bez absolutniho clenu: %f\n", y);
        } else {
            d = b * b - 4 * a * c;
            if (d >= 0) {
                double sqrtD = Math.sqrt(d);
                if (b >= 0) {
                    x1 = (-b - sqrtD) / (2 * a);
                    x2 = c / (x1 * a);
                    System.out.printf("Realne koreny jsou: %f %f\n", x1, x2);
                    return;
                } else {
                    x1 = (-b + sqrtD) / (2 * a);
                    x2 = c / (x1 * a);
                    System.out.printf("Realne koreny jsou: %f %f\n", x1, x2);
                }
            } else {
                x1 = -b / (2 * a);
                x2 = Math.sqrt(-d) / (2 * a);
                System.out.printf("Komplexni koreny jsou: %f + %fi a %f - %fi\n", x1, x2, x1, x2);
            }
        }
    }
}
