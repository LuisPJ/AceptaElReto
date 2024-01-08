import java.util.Scanner;
public class ADibujaHexagonos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            int lado = in.nextInt();
            String caracter = in.next();

            if(lado == 0 && caracter.equals("0")){
                break;
            }
            int pivote = lado;
            for (int altura = 1; altura <= lado; altura++){
                for (int blancos = 1; blancos <= lado - altura; blancos++){
                    System.out.print(" ");
                }

                if(altura == 1){
                    for (int asteriscos = 1; asteriscos <= lado; asteriscos++){
                        System.out.print(caracter);
                    }
                }else{
                    pivote = pivote +2;
                    for (int asteriscos = 1; asteriscos <= pivote; asteriscos++){
                        System.out.print(caracter);
                    }
                }
                System.out.println();
            }
            for (int altura = lado-1; altura >= 1; altura--){
                for (int blancos = 1; blancos <= lado - altura; blancos++){
                    System.out.print(" ");
                }

                if(altura == 1){
                    for (int asteriscos = 1; asteriscos <= lado; asteriscos++){
                        System.out.print(caracter);
                    }
                }else{
                    pivote = pivote -2;
                    for (int asteriscos = 1; asteriscos <= pivote; asteriscos++){
                        System.out.print(caracter);
                    }
                }
                System.out.println();
            }
        }
    }
}
