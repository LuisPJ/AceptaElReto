import java.util.Scanner;
public class EsMatrizDeIdentidad {
    /*
     * Se dice que una matriz es identidad cuando todos sus elementos son cero a excepcion de la diagonal principal, que se encuentra rellena de unos
     * Para que una matriz sea identidad debe de ser cuadrada, es decir, tener el mismo numero de filas que de columnas.
     * La entrada consta de una serie de casos de prueba. Cada uno comienza con un numero que representa el numero de filas, 
     * como maximo 50, de una matriz cuadrada. Tras el, aparecen los elementos que forman la matriz, que seran valores entre -1.000 y 1.000 (incluidos).
     * La entrada terminara con una matriz de 0 filas.
     * Para cada caso de prueba se indicara SI si la matriz es identidad y NO en caso contrario.
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(true){
            int ladoMatrix = in.nextInt();
            if(ladoMatrix == 0){
                break;
            }

            int[][] matrix = new int[ladoMatrix][ladoMatrix];
            in.nextLine();
            for (int i = 0; i < matrix.length; i++) {
                String linea = in.nextLine();
                String[] partes = linea.split(" ");
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = Integer.parseInt(partes[j]);                  
                }
            }
            //Verificar que todos los numeros excepto la diagonal sea cero
            boolean matrizDeIdentidad = true;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if(i == j){
                        if (matrix[i][j] != 1) {
                            matrizDeIdentidad = false;
                        }
                    }else{
                        if (matrix[i][j] != 0) {
                            matrizDeIdentidad = false;
                        } 
                    }
                }
            }

            if(matrizDeIdentidad){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }

        }
    }
    
}
