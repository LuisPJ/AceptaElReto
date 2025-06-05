public class problem_155 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) { 
            String linea_entrada = in.nextLine();
            String[] numeros_cadena = linea_entrada.split(" ");
            int ancho = Integer.parseInt(numeros_cadena[0]);
            int largo = Integer.parseInt(numeros_cadena[1]);

            if (ancho < 0 || largo < 0) {
                break;
            }

            System.out.println((2*ancho)+(2*largo));
        }
        in.close();
    }
}
