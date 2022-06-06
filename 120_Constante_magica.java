import java.util.Scanner;

public class Constante_magica {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int n = in.nextInt();
            int k = in.nextInt();
            if (n == 0 && k == 0) {
                break;
            }
            int resultado;
            resultado = (n*n*n + n) / 2 + (k-1) * n;
            
            System.out.println(resultado);
        }

    }

}
