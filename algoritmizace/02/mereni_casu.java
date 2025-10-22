import java.util.ArrayList;
import java.util.Scanner;

public class mereni_casu {
    public static long tic() {
        return System.currentTimeMillis();
    }
    public static long toc(long start) {
        return System.currentTimeMillis() - start;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arrlist = new ArrayList<>();
        int N=100000000;

        for(int i =0;i<N;i++){
            arrlist.add(1);
        }

        long start = tic();
        arrlist.remove(0);
        //arrlist.remove(N-1);
        long end = toc(start);
        System.out.println("Uplynuly cas: " + end + " ms");

    }
}


