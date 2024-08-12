import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class RelojATravesDelEspejo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero_entradas = in.nextInt();
        //Para que se nos muestre la hora espejo solo hay que restar la hora dada a una hora base que son las 12:00
        String hora_base_cadena = "12:00";
        for(int i = 0; i < numero_entradas; i++){
            String cadena_hora = in.next();
            //Separamos la hora y los minutos ya que hay que restarlos por separado.
            String[] partes_hora = cadena_hora.split(":");
            //Hacemos el formato en hora hh:mm ambas en minusculas para que el formato sea de 12 horas
            SimpleDateFormat formato_hora = new SimpleDateFormat("hh:mm");
            try {
                Date hora_base = formato_hora.parse(hora_base_cadena);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(hora_base);
                //Hacemos las restas multiplicando por -1
                calendar.add(calendar.HOUR, Integer.parseInt(partes_hora[0]) * -1);
                calendar.add(calendar.MINUTE, Integer.parseInt(partes_hora[1]) * -1);
                if (formato_hora.format(calendar.getTime()).equals("00:00")) {
                    System.out.println("12:00");   
                }else{
                    System.out.println(formato_hora.format(calendar.getTime()));
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } 
    }

}