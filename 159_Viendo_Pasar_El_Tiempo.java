import java.util.Scanner;

public class problem_159 {
    
    private static boolean contieneDigito(int hora, int digitoBuscado) {
        int hh = hora / 60;
        int mm = hora % 60;
        
        if (hh / 10 == digitoBuscado || hh % 10 == digitoBuscado ||
            mm / 10 == digitoBuscado || mm % 10 == digitoBuscado) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        while (true) {
            String linea = entrada.nextLine();
            String[] datos = linea.split(" ");
            
            if (datos[0].equals("24:00") && datos[1].equals("24:00")) {
                break;
            }
            
            String[] horaInicio = datos[0].split(":");
            String[] horaFin = datos[1].split(":");
            
            int minutosInicio = Integer.parseInt(horaInicio[0]) * 60 + Integer.parseInt(horaInicio[1]);
            int minutosFin = Integer.parseInt(horaFin[0]) * 60 + Integer.parseInt(horaFin[1]);
            int digitoBuscado = Integer.parseInt(datos[2]);
            
            int contador = 0;
            for (int minutoActual = minutosInicio; minutoActual <= minutosFin; minutoActual++) {
                if (contieneDigito(minutoActual, digitoBuscado)) {
                    contador++;
                }
            }
            
            System.out.println(contador);
        }
    }
}
