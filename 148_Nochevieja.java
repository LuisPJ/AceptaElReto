import java.util.Scanner;

public class Nochevieja {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String hora;
        String[] horaSeparada = new String[2];
        while (true) {            
            hora = in.nextLine();
            if(hora.equals("00:00")){
                break;
            }
            horaSeparada = hora.split(":");
            int horas = Integer.parseInt(horaSeparada[0]);
            int minutos = Integer.parseInt(horaSeparada[1]);
            int cont = 0;
            while (horas < 24) {                
                minutos += 1;
                cont++;
                if(minutos == 60){
                    minutos = 0;
                    horas++;
                }
            }
            System.out.println(cont);
        }
    }
    
}
