import java.util.Scanner;

public class NumerosCubifinitos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (true) {
			
			String numeroEntrada = in.nextLine();
			
			if (numeroEntrada.equals("0")) {
				break;
			}
			
			String salida = String.valueOf(numeroEntrada); 
			salida = esCubifinito(numeroEntrada, salida);
			
			if(salida.substring(salida.length() - 3).equals("1 -")) {
				System.out.println(salida + "> cubifinito.");
			}else {
				System.out.println(salida + "> no cubifinito.");
			}
			
		}

	}

	private static String esCubifinito(String numeroEntrada, String salida) {
		String linea = "";
		if(numeroEntrada.equals("1")) {
			if(salida.substring(salida.length() - 1).equals("-")) {
				return salida + " 1 -";
			}else {
				return salida + " -";
			}	
		}else {
			String[] vector = numeroEntrada.split("");
			int suma = 0;
			for (int i = 0; i < vector.length; i++) {
				suma += Math.pow(Integer.parseInt(vector[i]), 3);
			}
			linea += numeroEntrada + " -";
			salida = linea;
			if(String.valueOf(suma).equals(numeroEntrada)) {
				return salida;
			}else {
				return esCubifinito(String.valueOf(suma), salida);
			}
		}
	}

}
