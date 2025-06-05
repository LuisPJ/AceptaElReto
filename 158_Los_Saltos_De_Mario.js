import java.util.Scanner;

public class problem_158 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            procesarCasosPrueba(scanner);
        }
    }

    private static void procesarCasosPrueba(Scanner scanner) {
        int numeroCasos = scanner.nextInt();
        
        for (int i = 0; i < numeroCasos; i++) {
            int cantidadMuros = scanner.nextInt();
            
            // Procesar el primer muro
            int muroAnterior = scanner.nextInt();
            int saltosArriba = 0;
            int saltosAbajo = 0;
            
            // Procesar los muros restantes
            for (int j = 1; j < cantidadMuros; j++) {
                int muroActual = scanner.nextInt();
                
                if (muroActual > muroAnterior) {
                    saltosArriba++;
                } else if (muroActual < muroAnterior) {
                    saltosAbajo++;
                }
                
                muroAnterior = muroActual;
            }
            
            System.out.println(saltosArriba + " " + saltosAbajo);
        }
    }
}
