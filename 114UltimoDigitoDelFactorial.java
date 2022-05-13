import java.util.Scanner;


public class Ultimo_digito_del_factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
            for (int i = 0; i < num; i++) {
                int dato = in.nextInt();
                if(dato >= 5){
                    System.out.println(0);
                }else{
                    System.out.println(factorial(dato) % 10);
                }
            }
        
    }

    private static int factorial(int dato) {
        int d = 1;
        for (int i = dato; i >= 1; i--) {
            d *= i;
        }
        return d;
    }

    
    
}
