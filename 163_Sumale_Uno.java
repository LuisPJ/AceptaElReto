import java.math.BigInteger;
import java.util.Scanner;

public class problem_163 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String linea = scanner.nextLine();

                if (linea.equals("FIN")) {
                    break;
                }

                BigInteger numero = new BigInteger(linea, 16);
                numero = numero.add(BigInteger.ONE);

                String resultado = numero.toString(16).toUpperCase();
                System.out.println(resultado);
            }
        }
    }
}
