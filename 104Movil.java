import java.util.*;

public class Moviles {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in).useDelimiter("\n");
		
	
		Integer isBalanced;
		do {
			isBalanced = isBalanced(in);
			if(isBalanced == -1) {
				System.out.println("NO");
			}else if(isBalanced == 0) {
				break;
			}else {
				System.out.println("SI");
			}
		} while (in.hasNext());

	}

	private static int isBalanced(Scanner in) {
		Integer weight = -1;
		if(in.hasNext()) {
			Integer[] movil;
			movil = fillMovil(in.next());
			
			if(movil == null) {
				return 0;
			}
			if (movil[0] == 0 && movil[1] == 0 && movil[2] == 0 && movil[3] == 0) {
				return 0;
			}
			if(movil[0] == 0) {
				weight = isBalanced(in);
				movil[0] = weight;
			}
			if(movil[2] == 0) {
				weight = isBalanced(in);
				movil[2] = weight;
			}
			
			if (movil[0] == null || movil[2] == null) {
				weight = -1;
			}else{
				if (movil[0] * movil[1] == movil[2] * movil[3])
					weight = movil[0] + movil[2];
				else
					weight = -1;
			}
		}
		return weight;
	}

	private static Integer[] fillMovil(String line) {
		// TODO Auto-generated method stub
		if(line.equals("")) {
			return null;
		}else {
			Integer[] values = new Integer[4];
			line = line.substring(0, line.length()-1);
			String[] split = line.split(" ");
			for (int i = 0; i<4; i++) {
				values[i] = Integer.parseInt(split[i]);
			}
			return values;
		}
	}

}
