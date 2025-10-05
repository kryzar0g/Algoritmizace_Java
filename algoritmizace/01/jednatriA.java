import java.util.Scanner;
public class jednatriA {
    public static double Ruff(double a,double b,double c){
        double vysledek = ((a+b+c)-200)/10;
        return vysledek;
    }
    public static void main(String args[]){
        double a,b,c;
        Scanner bo = new Scanner(System.in);
        System.out.printf("V sede zmerte tep: \n");
        a = bo.nextDouble();
        System.out.printf("udelejte 30 drepu za 30 sekund \n");
        System.out.printf("po vykonu zmerte tep: \n");
        b = bo.nextDouble();
        System.out.printf("sednete si na 1  minutu\n");
        System.out.printf("V sede zmerte tep: \n");
        c = bo.nextDouble();

        System.out.printf("Vas Ruffieruv index je %.2f \n",Ruff(a,b,c));
        if(Ruff(a,b,c)<=0){System.out.printf("vyborna zdatnost \n");}
        else if(Ruff(a,b,c)>0&&Ruff(a,b,c)<=5){System.out.printf("velmi dobra zdatnost \n");}
        else if(Ruff(a,b,c)>5&&Ruff(a,b,c)<=10){System.out.printf("prumerna zdatnost \n");}
        else if(Ruff(a,b,c)>10&&Ruff(a,b,c)<=15){System.out.printf("podprumerna zdatnost \n");}
        else{System.out.printf("nedostatecna zdatnost \n");}
        






    }
}
