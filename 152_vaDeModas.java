import java.util.Scanner;

public class vaDeModas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int vec_size = in.nextInt();
            if (vec_size == 0) {
                break;
            }
            in.nextLine();
            String line = in.nextLine();
            String[] partes = line.split(" ");
            int value = 0;
            int contMay = 0;

            for (int i = 0; i < partes.length; i++) {
                int rep = 0;
                for (int j = 0; j < partes.length; j++) {
                    if(Integer.parseInt(partes[i]) == Integer.parseInt(partes[j])){
                        rep++;
                    }
                }
                if (rep > contMay) {
                    value = Integer.parseInt(partes[i]);
                    contMay = rep;
                }
            }

            System.out.println(value);
        }
    }
}
