import java.util.Scanner;
public class ctyricisla {
    public static void main(String args[]){
        float max= -99999999;
        Scanner mo = new Scanner(System.in);
        float cislo;
        float[] pole = new float[4];
        for (int i=0;i<4;i++){
            System.out.printf("zadejte cislo: \n");
            pole[i] = mo.nextFloat();
            if (i==0) max=pole[i];
            else{
                if(pole[i]>max)max =pole[i];
            }
        }
        System.out.printf("nejvetsi z cisel je : %f\n",max);

    }
}
