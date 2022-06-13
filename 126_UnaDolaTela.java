import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class UnaDolaTelaCatola {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.nextLine();
		for (int i = 0; i < num; i++) {
			String linea = in.nextLine();
			String[] lineaVec = linea.split(" ");
			String[] nombres = new String[lineaVec.length-3];
			String[] numeros = new String[2];
			for (int j = 0; j < lineaVec.length-3; j++) {
				nombres[j] = lineaVec[j];
			}
			int cont = 0;
			for (int j = lineaVec.length-2; j < lineaVec.length; j++) {
				numeros[cont] = lineaVec[j];
				cont++;
			}
			if(Integer.parseInt(numeros[0]) <= 0) {
				System.out.println("NADIE TIENE CAMA");
			}else if(Integer.parseInt(numeros[0])>nombres.length) {
				System.out.println("TODOS TIENEN CAMA");
			}else {
				List<String> myList = Arrays.asList(nombres);
				
				int conEli = 1, fina = nombres.length, contL=0, x = myList.size();
				while(true) {
					if(x <= Integer.parseInt(numeros[0])) {
						break;
					}
					if(conEli == Integer.parseInt(numeros[1])) {
						myList.set(contL, "");
						conEli = 0;
						x--;
					}
					contL++;
					if(contL == fina) {
						contL = 0; 
					}
					if(!myList.get(contL).equals("")) {
						conEli++;
					}
				}
				String men = "";
				for(int y = 0; y < myList.size(); y++) {
		            if(!myList.get(y).equals("")) {
		            	men = men + myList.get(y) + " ";
		            }
		        }
				men = men.substring(0, men.length()-1);
				System.out.println(men);
			}
		}
	}

}
