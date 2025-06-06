import java.util.Scanner;

public class problem_162 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) { 
            int tamanio = scanner.nextInt();
            if(tamanio == 0) break;
            char caracterNegro = scanner.next().charAt(0);
            dibujarTablero(tamanio, caracterNegro);
        }

        scanner.close();
    }

    public static void dibujarTablero(int tamanio, char caracterNegro) {
        int anchoTotal = 8 * tamanio;
        
        dibujarBorde(anchoTotal);

        for (int fila = 0; fila < 8; fila++) {
            for (int lineaEscaque = 0; lineaEscaque < tamanio; lineaEscaque++) {
                System.out.print("|");
                for (int columna = 0; columna < 8; columna++) {
                    boolean esNegro = (fila + columna) % 2 != 0;
                    for (int i = 0; i < tamanio; i++) {
                        System.out.print(esNegro ? caracterNegro : " ");
                    }
                }
                System.out.println("|");
            }
        }

        dibujarBorde(anchoTotal);
    }

    private static void dibujarBorde(int anchoTotal) {
        System.out.print("|");
        for (int i = 0; i < anchoTotal; i++) {
            System.out.print("-");
        }
        System.out.println("|");
    }
}
