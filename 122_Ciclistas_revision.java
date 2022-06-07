import java.util.*;

public class AvituallamientoEnLasEtapasCiclistas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (true) {
			String lista = in.nextLine();
			if(lista.equals("-1")) {
				break;
			}
			String[] etapas = lista.split(" ");
			int inicio = 0, contPlano = 0, bool = 1, contmay = 0, inicioMay = 0;
			for (int i = 0; i < etapas.length-2; i++) {
				if(Integer.parseInt(etapas[i]) == Integer.parseInt(etapas[i+1]) ) {
					if(bool == 1) {
						inicio = i;
						bool = 0;
					}
					contPlano++;
					if(Integer.parseInt(etapas[i+1]) != Integer.parseInt(etapas[i+2])) {
						if (inicio >= inicioMay && contPlano > contmay) {
							inicioMay = inicio;
							contmay = contPlano;
						}
						bool = 1;
						contPlano = 0;
					}
				}
			}
			if(inicioMay == 0 && contmay == 0) {
				System.out.println("HOY NO COMEN");
			}else {
				System.out.println(inicioMay + " " + contmay);
			}
		}

	}

}
