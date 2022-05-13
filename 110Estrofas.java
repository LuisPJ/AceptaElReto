import java.util.Scanner;

public class Estrofas {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int n = in.nextInt();
			if(n == 0) {
				break;
			}
			String[] versos = new String[n];
			 in.nextLine();
			for (int i = 0; i < versos.length; i++) {
				versos[i] = in.nextLine();
				versos[i] = versos[i].replaceAll("[^a-zA-Z0-9]", "");
			}
			String respuesta;
			if(n == 2) {
				respuesta = dosVersos(versos);
			}else if(n == 3) {
				respuesta = tresVersos(versos);
			}else if(n == 4) {
				respuesta = cuatroVersos(versos);
			}else {
				respuesta = "DESCONOCIDO";
			}
			System.out.println(respuesta);
		}
	}

	private static String cuatroVersos(String[] versos) {
		int index = penultimaVocal(versos[0]);
		String v1 = versos[0].substring(versos[0].length()-index);
		String v2 = versos[1].substring(versos[1].length()-index);
		String v3 = versos[2].substring(versos[2].length()-index);
		String v4 = versos[3].substring(versos[3].length()-index);
		if(v1.equals(v4) && !v1.equals(v2) && v2.equals(v3)) {
//			if(tieneConsonante(v1, index) && tieneConsonante(v2, index)) {
				return "CUARTETO";
//			}
		}else if(v1.equals(v3) && !v1.equals(v2) && v2.equals(v4)) {
	//		if(tieneConsonante(v1, index) && tieneConsonante(v2, index)) {
				return "CUARTETA";
		//	} 	
		}else if(v2.equals(v4) && !v1.equals(v2) && !v2.equals(v3)) {
			//if(!tieneConsonante(v2, index)) {
				return "SEGUIDILLA";
			//}
		}else if(v1.equals(v2) && v2.equals(v3) && v3.equals(v4)) {
			return "CUADERNA VIA";
		}
		return "DESCONOCIDO";
	}

	private static String tresVersos(String[] versos) {
		int index = penultimaVocal(versos[0]);
		String v1 = versos[0].substring(versos[0].length()-index);
		String v2 = versos[1].substring(versos[1].length()-index);
		String v3 = versos[2].substring(versos[2].length()-index);
		if(v1.equals(v3) && !v1.equals(v2)) {
//			if(tieneConsonante(v1, index)) {
				return "TERCETO";
	//		}else {
		//		return "DESCONOCIDO";
			//}
		}else {
			return "DESCONOCIDO";
		}
	}

	private static String dosVersos(String[] versos) {
		int index = penultimaVocal(versos[0]);
		String v1 = versos[0].substring(versos[0].length()-index);
		String v2 = versos[1].substring(versos[1].length()-index);
		if(v1.equals(v2)) {
			//if(tieneConsonante(v1, index)) {
				return "PAREADO";
			//}else {
				//return "DESCONOCIDO";
			//}
		}else {
			return "DESCONOCIDO";
		}
	}
	
	private static boolean esVocal(char a) {
		if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') return true;
		return false;
	}
	
	private static int penultimaVocal(String verso) {
		int index = 0;
		int cont = 0;
		for (int i = verso.length()-1; i >= 0 ; i--) {
			if(esVocal(verso.charAt(i)) && cont == 1) {
				return (index+1);
			}else if(esVocal(verso.charAt(i)) && cont<1){
				cont++;
			}
			index++;
		}
		return (index+1);
	}
	
	private static boolean tieneConsonante(String verso, int index) {
		for (int i = 0; i < verso.length(); i++)
			if(!esVocal(verso.charAt(i)))return true;
		return false;
	}
	
	
	
}
