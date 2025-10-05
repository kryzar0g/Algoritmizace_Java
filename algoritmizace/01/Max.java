public class Max {
    public static int max_z_2(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    public static void ahoj() {
        System.out.println("Ahoj");
    }

    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.printf("vetsi z cisel %d a %d je %d \n", a, b, max_z_2(a, b));

        Vypocty v = new Vypocty(); 

        v.setHodnota(25);           
        System.out.printf("hodnota je %d \n", v.getHodnota()); 
    }
}

class Vypocty {
    private int hodnota = 0;

    public void setHodnota(int h) {
        this.hodnota = h;
    }

    public int getHodnota() {
        return this.hodnota;
    }
}
