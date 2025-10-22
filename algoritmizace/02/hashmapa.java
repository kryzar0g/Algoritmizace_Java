import java.util.HashMap;
public class hashmapa {
    public static void main(String args[]){
        HashMap<Integer, String> mapa = new HashMap<>();
        int vek;
        String jmeno;
        float prumer=0;
        mapa.put(12, "Pepa");
        mapa.put(15, "Jirka");
        mapa.put(14, "Honza");
        mapa.put(16, "Karel");
        mapa.put(13, "Tonda");

        System.out.println(mapa);
        jmeno = "Jirka";
        System.out.println(mapa.get(15));
        mapa.remove(13);
        System.out.println(mapa);
        for (Integer i:mapa.keySet()){
            System.out.printf("vek: %d jmeno: %s \n", i, mapa.get(i));
            prumer+=i;
        }
        prumer= prumer/mapa.size();
        System.out.printf("prumer veku: %.2f \n", prumer);
    }}