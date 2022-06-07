import java.util.*;

public class cuantasMeLlevo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (true) {
			String linea = in.nextLine();
			if(linea.equals("0 0")) {
				break;
			}
			String[] numeros = linea.split(" ");
			String[] numero1 = numeros[0].split("");
			String[] numero2 = numeros[1].split("");
			
			int cont = 0, acum=0;
			
			for (int i = numero1.length; i >= 0; i--) {
				try {
					int num = (Integer.parseInt(numero1[i])+Integer.parseInt(numero2[i]));
					if(num+acum >= 10) {
						cont++;
						acum = 1;
					}else {
						acum = 0;
					}
				} catch (Exception e) {
					cont+=0;
				}
			}
			System.out.println(cont);
		}
	}

}
