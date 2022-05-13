import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;



public class Constante_Krapekar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int repeticiones = in.nextInt();
		for (int i = 0; i < repeticiones; i++) {
			int numero = in.nextInt();
			if(numero == 6174) {
				System.out.println("0");
			}else {
				constanteKrapekar(numero, 1);
			}
		}

	}
	
	public static void constanteKrapekar(int numero, int cont) {
		
		String temp = Integer.toString(numero);
		Integer[] newGuess = new Integer[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
		    newGuess[i] = temp.charAt(i) - '0';
		}
		
		String unionString = "";
        int unionDesc = 0;
        Arrays.sort(newGuess, Collections.reverseOrder());
        for(int i = 0; i < newGuess.length; i++) {
            unionString += newGuess[i];
        }
 
        unionDesc = Integer.parseInt(unionString);

        if(unionDesc < 10) {
        	unionDesc *= 1000;
        }
        if(unionDesc < 100) {
        	unionDesc *= 100;
        }
        if(unionDesc < 1000) {
        	unionDesc *= 10;
        }
        
        unionString = "";
        int unionAsc = 0;
        Arrays.sort(newGuess);
        for(int i = 0; i < newGuess.length; i++) {
            unionString += newGuess[i];
        }
        unionAsc = Integer.parseInt(unionString);
        numero = unionDesc - unionAsc;
        
        if(numero == 6174) {
        	System.out.println(cont);
        }else {
            if(numero == 0) {
            	System.out.println("8");
            }else {
              cont++;
              constanteKrapekar(numero, cont);
            }
        }
		
	}

}
