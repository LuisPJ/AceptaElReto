import java.util.Scanner;

public class NumeroKaprekar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			String entrada = String.valueOf(in.nextInt());
			if(entrada.equals("0")) {
				break;
			}
			boolean bandera = esKaprekar(entrada);
			if(bandera || entrada.equals("1")) {
				System.out.println("SI");
			}else {
				System.out.println("NO");
			}
		}
	}

	private static boolean esKaprekar(String entrada) {
		long numElevado = (long) Math.pow(Integer.parseInt(entrada), 2);
		String elevado = String.valueOf(numElevado);
		long numInicial = Long.parseLong(entrada);
		boolean bandera = Recursion("",elevado,numInicial);
		return bandera;
	}

	private static boolean Recursion(String x, String elevado, long numInicial) {
		if(elevado.equals("")) {
			return false;
		}else if(Long.parseLong(elevado) == 0) {
			return false;
		}else if(x.equals("")) {
			x = x.concat(elevado.substring(0,1));
			elevado = elevado.substring(1);
			return Recursion(x, elevado, numInicial);
		}else if(Long.parseLong(elevado) + Long.parseLong(x) == numInicial) {
			return true;
		}else {
			x = x.concat(elevado.substring(0,1));
			elevado = elevado.substring(1);
			return Recursion(x, elevado, numInicial);
		}
	}
}
