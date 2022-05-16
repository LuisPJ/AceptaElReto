import java.util.*;

public class ProblemasDeHerencia {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			while (true) {
				int[] coefficients;
				
				int grade = in.nextInt();
				
				if(grade == 20) {break;}
				
				coefficients = putCoefficients(grade, in);
				
				//Problema con el Scanner ?? me toco hacer un metodo
				
				double cain = RiemannSum(coefficients, grade, in);
				printEquity(cain, 1 - cain);
			}
		}
	}

	private static int[] putCoefficients(int grade, Scanner in) {
		int Vector[] = new int[grade + 1];
		for (int i = 0; i <= grade; i++) {
			Vector[i] = in.nextInt();
		}
		in.nextLine();
		return Vector;
	}

	private static void printEquity(double cain, double abel) {
		if((cain-abel > 0.001)) {
			System.out.println("CAIN");
		}else if((cain-abel < -0.001)) {
			System.out.println("ABEL");
		}else {
			System.out.println("JUSTO");
		}
		
	}

	private static double RiemannSum(int[] coefficients, int grade, Scanner in) {
		double result = 0d;
		int numberOfRectangles = in.nextInt();
		for (int j = 0; j < numberOfRectangles; j++) {
			result += function(coefficients,(double)j/numberOfRectangles,grade)/numberOfRectangles;
		}
		return result;
	}

	private static double function(int[] coefficients, double d, int grade) {
		double result = 0d;
		for (int i = grade; i >= 0; i--) {
			result += coefficients[coefficients.length-i-1] * Math.pow(d, i);
		}
		if (result < 0) {
			result = 0d;
		}else if(result > 1) {
			result = 1d;
		}
		
		return result;
	}

}
