import java.util.*;

public class Encriptacion_de_mensajes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String message; 
		while (true) {
			message = in.nextLine();
			message = message.replaceAll("[^a-zA-Z0-9]", "");
			if(message.charAt(0) == 'p' || message.charAt(0) == 'P') {
				System.out.println(countVowels(message));
			}else {
				String newMessage = decryptMessages(message);
				if(newMessage.equals("pFIN") || newMessage.equals("PFIN")) {
					break;
				}else {
					System.out.println(countVowels(newMessage));
				}
			}
		}
	}
	
	
	
	public static String decryptMessages(String message) {
		
		int[] vectorAscii = new int[message.length()];
		char[] letters = message.toCharArray();
		
		for (int i = 0; i < vectorAscii.length; i++) {
			vectorAscii[i] = (byte) Character.toLowerCase(letters[i]);
		}
		
		int valueOperation; 
		
		if(vectorAscii[0] > 112) {
			valueOperation = vectorAscii[0] - 112;
			for (int i = 0; i < vectorAscii.length; i++) {
				vectorAscii[i] -= valueOperation;
				if(vectorAscii[i] < 97) {
					vectorAscii[i] = (123 - (97 - vectorAscii[i]));
				}
			}
		}else {
			valueOperation = 112 - vectorAscii[0];
			for (int i = 0; i < vectorAscii.length; i++) {
				vectorAscii[i] += valueOperation;
				if(vectorAscii[i] > 122) {
					vectorAscii[i] = ((vectorAscii[i] - 122) + 96);
				}
			}
		}
		
		char[] newMessageVector = new char[message.length()];
		for (int i = 0; i < newMessageVector.length; i++) {
			newMessageVector[i] = (char)vectorAscii[i];
		}
		
		for (int i = 0; i < letters.length; i++) {
			if (Character.isUpperCase(letters[i])) {
				newMessageVector[i] = Character.toUpperCase(newMessageVector[i]);
			}
		}
		
		return String.valueOf(newMessageVector);	
	}
	
		
	public static int countVowels(String messageVector) {		
		int contVowels = 0;
		for (int i = 0; i < messageVector.length(); i++) {
			char letter = messageVector.charAt(i);
			if(letter == 'a' || letter == 'e' || letter == 'i' 
					|| letter == 'o' || letter == 'u' || letter == 'A'
					|| letter == 'E' || letter == 'I' 
					|| letter == 'O' || letter == 'U') {
				contVowels += 1;
			}
		}
		return contVowels;
	}

}
