import java.util.Scanner;

public class DiasFaltan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int diasT = 365, cont = 0, mes, dia, veces;
        int[] DiasAnio = new int[12];
        DiasAnio[0] = 31;
        DiasAnio[1] = 28;
        DiasAnio[2] = 31;
        DiasAnio[3] = 30;
        DiasAnio[4] = 31;
        DiasAnio[5] = 30;
        DiasAnio[6] = 31;
        DiasAnio[7] = 31;
        DiasAnio[8] = 30;
        DiasAnio[9] = 31;
        DiasAnio[10] = 30;
        DiasAnio[11] = 31;
        veces = in.nextInt();
        for (int j = 0; j < veces; j++) {
            dia = in.nextInt();
            mes = in.nextInt();
            for (int i = 0; i < mes; i++) {
                cont = cont + DiasAnio[i];
            }
            cont = cont - (DiasAnio[mes - 1] - dia);
            cont = diasT - cont;
            System.out.println(cont);
            cont = 0;
        }

    }

}
