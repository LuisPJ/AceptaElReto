import java.util.*;

public class AproximacionDeGauss {
	public static void main(String[] args) {
		
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			;
			
			while (true) {
				
				int n;
				double m;
				n = in.nextInt();
				m = in.nextDouble();
				
				if(n == 0 && m == 0) {
					break;
				}
				
				if ((n >= 0 && n < 100000) && (m >= 0 && m <= 5)) {
					double maximumAllowed = maximumAllowed(n,m);
					double primeTheorem = primeTheorem(n,m);
					if(primeTheorem > maximumAllowed) {
						System.out.println("Mayor");
					}else if(primeTheorem < maximumAllowed) {
						System.out.println("Menor");
					}else {
						System.out.println("Igual");
					}
				}else {
					continue;
				}
				

			}
		}
		

	}

	private static double primeTheorem(int n, double m) {
		double numberPrime = 0;
        for (int i = 2; i <= n; i++){
            	if (isPrime(i)) numberPrime++;
        }
		double error = Math.abs((double)numberPrime/n - (double)1/Math.log(n));
		return error;
	}


	private static double maximumAllowed(int n, double m) {
		double error = 1/Math.pow(10, m);
		return error;
	}
	
	private static boolean isPrime(int numero){
        boolean ok = true;
        if (numero < 2)
            ok = false;
        else
            for (int i = 2; i * i <= numero; i++) {
                if (numero % i == 0) {
                    ok = false;
                    break;
                }
            }
        return ok;
    }

}
