import java.util.Scanner;

public class Ventas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] semana = new String[6];
        double[] ventas = new double[6];
        int contSemana = 0;
        semana[0] = "MARTES";
        semana[1] = "MIERCOLES";
        semana[2] = "JUEVES";
        semana[3] = "VIERNES";
        semana[4] = "SABADO";
        semana[5] = "DOMINGO";
        while (true) {

            ventas[contSemana] = Double.parseDouble(in.nextLine());

            if (contSemana == 0 && ventas[contSemana] == -1) {
                break;
            }
            if (contSemana == 5) {
                System.out.println(ImprimirMayor(semana, ventas) + " " + ImprimirMenor(semana, ventas) + " " + ImprimirDomingo(semana, ventas));
            }
            contSemana++;
            if (contSemana == 6) {
                contSemana = 0;
            }
        }
    }

    private static String ImprimirMayor(String[] semana, double[] ventas) {
        double top, empate = 0;
        int indice = 0;
        top = 0;
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] > top) {
                top = ventas[i];
                indice = i;
            }
        }
        for (int i = 0; i < ventas.length; i++) {
            if (top == ventas[i]) {
                empate++;
            }
        }
        if (empate > 1) {
            return "EMPATE";
        } else {
            return semana[indice];
        }
    }

    private static String ImprimirMenor(String[] semana, double[] ventas) {
        double low, empate = 0;
        int indice = 0;
        low = ventas[0];
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] < low) {
                low = ventas[i];
                indice = i;
            }
        }
        for (int i = 0; i < ventas.length; i++) {
            if (low == ventas[i]) {
                empate++;
            }
        }
        if (empate > 1) {
            return "EMPATE";
        } else {
            return semana[indice];
        }
    }

    private static String ImprimirDomingo(String[] semana, double[] ventas) {
        double suma = 0;
        for (int i = 0; i < ventas.length; i++) {
            suma += ventas[i];
        }
        suma = suma / 6;
        if (ventas[5] > suma) {
            return "SI";
        } else {
            return "NO";
        }
    }

}
