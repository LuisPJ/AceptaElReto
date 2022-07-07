import java.util.Scanner;

public class SumaDeDigitos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (true) {
			
			String num = in.nextLine();
			
			if(Integer.parseInt(num) < 0) {
				break;
			}
			
			
			String linea = "";
			int sum = 0;
			
			for (int i = 0; i < num.length(); i++) {
				if(i == num.length()-1) {
					linea += num.charAt(i) + " = "; 
				}else {
					linea += num.charAt(i) + " + ";
				}
				String n = String.valueOf(num.charAt(i));
				sum += Integer.parseInt(n);
			}
			
			System.out.println(linea + sum);
		}
	}

}
