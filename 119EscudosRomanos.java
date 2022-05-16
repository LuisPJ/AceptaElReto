import java.util.Scanner;

public class Escudos{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		while (true) {
			int num = in.nextInt();
			
			if (num == 0)break;
			
			
			int aux = num, sum = 0;
			while(aux >= 1) {
				double o = 0;
				int raiz = (int) Math.sqrt(aux);
				int pot = (int) Math.pow(raiz, 2);
				o = (raiz*2)+((raiz-2)*2)+4;
				if(aux != 1) {
					sum += pot;
					sum += o;
				}else {
					sum += 5;
				}
				aux -= pot;
			}
			
			System.out.println(sum);
		}
	}

}
