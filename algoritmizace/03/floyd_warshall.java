public class floyd_warshall {
    public static void main(String[] args) {    
        int INF = 99999;
        int matice[][] = { {0,   4,  INF, 5, INF},
                          {INF, 0,   1, INF,6},
                          {2, INF, 0,   3, INF},
                          {INF, INF, 1, 0, 2},
                          {1, INF, INF, 4, 0} };

        printM(floydWarshall(matice));
    }

    public static int[][] floydWarshall(int[][] matice) {
        int n = matice.length;
        int vysledek[][] = new int[n][n];

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                vysledek[i][j] = matice[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if(vysledek[i][j] > vysledek[i][k] + vysledek[k][j]){
                        vysledek[i][j] = vysledek[i][k] + vysledek[k][j];
                    }
                }
            }
        }
        return vysledek;
    }

    
    public static void printM(int[][]A){
        int n = A.length;
        System.out.println("vysledek:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == 99999) {
                    System.out.print("INF ");
                } else {
                    System.out.print(A[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
