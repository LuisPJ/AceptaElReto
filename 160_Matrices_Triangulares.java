import java.util.Scanner;

public class problem_160 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            }
            int[][] array = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = in.nextInt();
                }
            }
            
            if (esTriangularSuperior(array) || esTriangularInferior(array)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean esTriangularSuperior(int[][] array) {
        boolean esTriangular = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i > j && array[i][j] != 0) {
                    esTriangular = false;
                }
            }
        }
        return esTriangular;
    }

    public static boolean esTriangularInferior(int[][] array) {
        boolean esTriangular = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i < j && array[i][j] != 0) {
                    esTriangular = false;
                }
            }
        }
        return esTriangular;
    }
    
}
