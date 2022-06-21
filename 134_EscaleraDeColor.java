import java.util.Arrays;
import java.util.Scanner;

public class EscaleraDeColor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String cadena = in.nextLine();
		String[] vectorCadena = cadena.split(" ");
		boolean flag = true;
		
		String paloInicial = vectorCadena[1]; 
		for (int i = 1; i < vectorCadena.length; i += 2) {
			if(!vectorCadena[i].equals(paloInicial)) {
				flag = false;
				break;
			}
		}
		
		int[] numeros = new int[vectorCadena.length / 2];
		int cont = 0;
		
		for (int i = 0; i < vectorCadena.length; i += 2) {
			if(vectorCadena[i].equals("J")) {
				vectorCadena[i] = "10";
			}else if(vectorCadena[i].equals("Q")) {
				vectorCadena[i] = "11";
			}else if(vectorCadena[i].equals("K")) {
				vectorCadena[i] = "12";
			}else if(vectorCadena[i].equals("A")) {
				vectorCadena[i] = "13";
			}
			
			numeros[cont] = Integer.parseInt(vectorCadena[i]);
			cont++;
		}
		
		if(flag) {
			Arrays.sort(numeros);
			for (int i = 0; i < numeros.length-1; i++) {
				if(!(numeros[i+1] == numeros[i]+1)) {
					flag = false;
				}
			}
			if(flag) {
				if(numeros[numeros.length - 1] == 13) {
					System.out.println("9 " + paloInicial);
				}else {
					if((numeros[numeros.length - 1] + 1) == 10) {
						System.out.println("J"+ " " + paloInicial);
					}else if((numeros[numeros.length - 1] + 1) == 11) {
						System.out.println("Q"+ " " + paloInicial);
					}else if((numeros[numeros.length - 1] + 1) == 12) {
						System.out.println("K"+ " " + paloInicial);
					}else if((numeros[numeros.length - 1] + 1) == 13) {
						System.out.println("A"+ " " + paloInicial);
					}else {
						System.out.println((numeros[numeros.length - 1] + 1)+ " " + paloInicial);
					}
				}
			}else {
				System.out.println("NADA");
			}
		}else {
			System.out.println("NADA");
		}

	}

}

