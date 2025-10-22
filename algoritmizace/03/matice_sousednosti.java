public class matice_sousednosti {
    
    public static int[][] matice_N(int[][] A,int [][]B){
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }
    return C;
}


    public static int suma(int[][]A){
        int suma = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                suma += A[i][j];
            }
        }
        return suma;
    }
    public static int[][] prevod(int [][] A){
        int n = A.length;
        int[][] b = new int[n][n];
        
        int[][] vynasobena = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                vynasobena[i][j] = A[i][j];
                b[i][j] = Integer.MAX_VALUE;
            }
        }
        int count = 1;

        while (suma(vynasobena) > 0 && count < n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (vynasobena[i][j] > 0 && b[i][j] == Integer.MAX_VALUE && i != j) {
                        b[i][j] = count;
                    }
                }
            }

            vynasobena = matice_N(vynasobena, A);
            count++;
        }

        return b;
    }











   
    public static void main(String[] args) {
        int[][] matice = {
            {0, 1, 0, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 1},
            {0, 0, 0, 0}
        };

        System.out.println("Matice sousednosti grafu:");
        for (int i = 0; i < matice.length; i++) {
            for (int j = 0; j < matice[i].length; j++) {
                System.out.print(matice[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Matice sousednosti pro cesty delky:");
        int[][] vysledek = prevod(matice);
        for (int i = 0; i < vysledek.length; i++) {
            for (int j = 0; j < vysledek[i].length; j++) {
                System.out.print(vysledek[i][j] + " ");
            }
            System.out.println();
        }}
    }
