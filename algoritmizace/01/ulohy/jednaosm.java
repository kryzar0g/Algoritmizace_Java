import java.util.Scanner;

public class jednaosm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double teplota,teplota_celkem,tep,tep_celkem,max,prum_ok;
        int pocet_mereni,ok_pacienti;
        tep_celkem = 0;
        teplota_celkem = 0;
        ok_pacienti = 0;
        pocet_mereni = 0;
        max = 0;//ocekavam ze tep nebude zaporny u lidi
        prum_ok = 0;

        do
        {
            System.out.print("Zadejte teplotu ve C: ");
            teplota = sc.nextDouble();
            System.out.print("Zadejte tep: ");
            tep = sc.nextDouble();

            teplota_celkem += teplota;
            tep_celkem += tep;

            if(tep>max) max = teplota;

            if((teplota>36 && teplota < 37)&&(tep>=55 && tep<=85)){
                ok_pacienti++;
                prum_ok += tep;
            }
            
            pocet_mereni++;
        }
        while(teplota != 0 && tep != 0);
        
        System.out.println("Prumerna teplota: "+(teplota_celkem/pocet_mereni)+" C");
        System.out.println("Prumerny tep: "+(tep_celkem/pocet_mereni)+" tep/min");
        System.out.println("Pocet pacientu s normalnimi hodnotami: "+ok_pacienti);
        System.out.println("Procento pacientu s normalnimi hodnotami: "+((ok_pacienti*100)/pocet_mereni)+" %");
        System.out.println("Nejvyssi teplota u pacientu: "+max+" tep/min");
        System.out.println("Prumerny tep u pacientu splnujicich podminky: "+(prum_ok/ok_pacienti)+" tep/min");
        

        
    }
}
