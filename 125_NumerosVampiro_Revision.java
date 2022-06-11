import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumerosVampiro {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		for (int i = 0; i < num; i++) {
			long valor = in.nextLong();
			boolean ban = false;
			if(String.valueOf(valor).length() % 2 == 0) {
				Set<String> perm = permutationFinder(String.valueOf(valor));
				for(String s : perm){
		            int num1 = Integer.parseInt(s.substring(0, s.length()/2));
		            int num2 = Integer.parseInt(s.substring(s.length()/2, s.length()));
		            if(num1*num2 == valor) {
		            	if(num1%10 == 0 && num2%10 == 0) {
		            		ban = false;
		            	}else {
		            		ban = true;
		            		break;
		            	}
		            }
		        }
				if(ban) {
					System.out.println("SI");
				}else {
					System.out.println("NO");
				}
			}else {
				System.out.println("NO");
			}
			
		}
	}
	
	public static Set<String> permutationFinder(String str) {
        Set<String> perm = new HashSet<String>();
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0); 
        String rem = str.substring(1);
        Set<String> words = permutationFinder(rem);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
                perm.add(insertChar(strNew, initial, i));
            }
        }
        return perm;
    }

    public static String insertChar(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }

}
