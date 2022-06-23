import java.util.Scanner;

public class cerosDelFactorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int entradas = in.nextInt();
		
		for (int i = 0; i < entradas; i++) {
			int caso = in.nextInt();
			int respuesta = 0, multiplosVC;
			multiplosVC = caso/5;
			
			while (multiplosVC > 0) {
				respuesta += multiplosVC;
				multiplosVC /= 5;
			}
			
			System.out.println(respuesta);
		}
		
	}
}
