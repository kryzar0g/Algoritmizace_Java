
import java.util.Scanner;
public class mini1A {
    
    public static void main(String args[]){
       int soucet_oken=0;
    int max=0;
    int umyto=0;
    Scanner sc = new Scanner(System.in);

    for(int i = 0;i<3;i++){

    System.out.printf("Zadej pocet oken umytych brigadnikem c. :%d\t",i+1);
    umyto = sc.nextInt();
    soucet_oken = soucet_oken + umyto;
    if (umyto < 10){
        System.out.println("malo vykonny brigadnik - vyradit!!!\n");
    }
    if (umyto > max){
        max = umyto;}
    }
System.out.printf("Celkem bylo umyto oken: %d\n",soucet_oken);
System.out.printf("jeden brigadnik dnes umyl maximalne %d oken\n",max);
sc.close();
}


    }
    

