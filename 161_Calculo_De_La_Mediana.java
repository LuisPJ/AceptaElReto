import java.util.Arrays;
import java.util.Scanner;

public class problem_161 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                int cantidadNumeros = scanner.nextInt();

                if (cantidadNumeros == 0) {
                    break;
                }

                int[] numeros = leerNumeros(scanner, cantidadNumeros);
                
                long resultado = calcularDobleMediana(numeros);
                System.out.println(resultado);
            }
        } catch (Exception e) {
            System.err.println("Error durante la ejecución: " + e.getMessage());
        }
    }

    private static int[] leerNumeros(Scanner scanner, int cantidad) {
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = scanner.nextInt();
        }
        return numeros;
    }

    private static long calcularDobleMediana(int[] numeros) {
        Arrays.sort(numeros);
        double mediana;
        
        if (numeros.length % 2 == 0) {
            mediana = ((double)numeros[numeros.length / 2] + numeros[numeros.length / 2 - 1]) / 2;
        } else {
            mediana = numeros[numeros.length / 2];
        }
        
        return Math.round(mediana * 2);
    }
}
