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

        while (true) {
            int ladoMatrix = in.nextInt();

            if(ladoMatrix == 0){
                break;
            }

            if(ladoMatrix > 50){
                System.out.println("NO"); 
                in.nextLine();
                continue;
            }

            int[][] matrix = new int[ladoMatrix][ladoMatrix];
            in.nextLine();

            boolean esMatrizDeIdentidad = true;

            for (int i = 0; i < ladoMatrix; i++) {
                String[] partes = in.nextLine().split(" ");
                
                if (partes.length != ladoMatrix) {
                    esMatrizDeIdentidad = false;
                    break; // Salir si la cantidad de elementos en la fila es incorrecta
                }
                
                for (int j = 0; j < ladoMatrix; j++) {
                    int valor = Integer.parseInt(partes[j]);
                    
                    if (valor < -1000 || valor > 1000) {
                        esMatrizDeIdentidad = false;
                        break; // Salir si el valor está fuera del rango permitido
                    }

                    if (i == j && valor != 1) {
                        esMatrizDeIdentidad = false;
                    } else if (i != j && valor != 0) {
                        esMatrizDeIdentidad = false;
                    }
                }
                
                if (!esMatrizDeIdentidad) {
                    in.nextLine(); // Limpiar cualquier entrada restante en caso de error
                    break; // Salir del bucle si la matriz no es identidad
                }
            }

        }
    }
    
}