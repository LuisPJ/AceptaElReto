import java.util.Scanner;

public class LlenandoPiscinas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			long y1 = in.nextInt();
            long y2 = in.nextInt();
            long y3 = in.nextInt();
            long v1 = in.nextInt();
            long v2 = in.nextInt();
            long v3 = in.nextInt();
            
            if (y1 == 0 && y2 == 0 && y3 == 0 && v1 == 0 && v2 == 0 && v3 == 0) {
                break;
            }
            
            int contY = 0, contV = 0;
            long valor = y2-y3, total = y1;
            contY = resultado(valor, total);
            valor = v2-v3;
            total = v1;
            contV = resultado(valor, total);
            
            if(contY == contV) {
            	System.out.println("EMPATE " + contV);
            }else if(contV > contY || contV < 0) {
            	System.out.println("YO " + contY);
            }else {
            	System.out.println("VECINO " + contV);
            }
		}
	}

	private static int resultado(long valor, long total) {
		int cont = 0;
		if(valor <= 0) {
			cont = -1;
		}else {
			while (true) {
	        	
	        	if(total <= 0) {
	        		break;
	        	}else {
	        		total -= valor;
	        		cont++;
	        	}
			}
		}
		return cont;
	}

}
