import java.util.Scanner;
public class Ascensor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) { 
            String linea_entrada = in.nextLine();
            
            String[] pisos = linea_entrada.split(" ");
            if (Integer.parseInt(pisos[0]) < 0) {
                break;
            }
            int recorrido = 0;
            
            for (int idx = 0; idx < pisos.length - 2; idx++) {
               if(Integer.parseInt(pisos[idx]) >= 0 && Integer.parseInt(pisos[idx+1]) >= 0){
                    if(Integer.parseInt(pisos[idx]) < Integer.parseInt(pisos[idx+1])){
                            recorrido += Integer.parseInt(pisos[idx+1]) - Integer.parseInt(pisos[idx]);
                    }else if(Integer.parseInt(pisos[idx + 1]) < Integer.parseInt(pisos[idx])){
                            recorrido += Integer.parseInt(pisos[idx]) - Integer.parseInt(pisos[idx+1]);
                    }
               }
            }

            System.out.println(recorrido);
        }
    }
}
