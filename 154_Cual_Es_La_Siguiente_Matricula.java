import java.util.Scanner;

public class problem_154 {

    private static final String LETRAS_PERMITIDAS = "BCDFGHJKLMNPQRSTVWXYZ";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            String matricula = in.nextLine();
            if (matricula.equals("9999 ZZZ")) {
                break;
            }

            String[] partes_matriculas = matricula.split(" ");
            if (partes_matriculas.length != 2) {
                System.out.println("Formato de matrícula incorrecto.");
                continue;
            }

            String numeroStr = partes_matriculas[0];
            String letrasStr = partes_matriculas[1];

            int numero = Integer.parseInt(numeroStr);
            if (numero == 9999) {
                numero = 0;
                char[] letras = letrasStr.toCharArray();
                boolean carry = true;
                for (int i = letras.length - 1; i >= 0; i--) {
                    if (carry) {
                        int index = LETRAS_PERMITIDAS.indexOf(letras[i]);
                        if (index == LETRAS_PERMITIDAS.length() - 1) {
                            letras[i] = LETRAS_PERMITIDAS.charAt(0);
                        } else {
                            letras[i] = LETRAS_PERMITIDAS.charAt(index + 1);
                            carry = false;
                        }
                    }
                }
                letrasStr = new String(letras);
            } else {
                numero++;
            }

            String numeroFormato = String.format("%04d", numero);
            String resultado = numeroFormato + " " + letrasStr;

            System.out.println(resultado);
        }

        in.close();
    }
}
