import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class vaDeModas_Optimizado {
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

            Map<Integer, Integer> frequencyMap = new HashMap<>();
            int max = 0;
            int cont = 0;

            for (String parte: partes) {
                int num = Integer.parseInt(parte);
                int count = frequencyMap.containsKey(num) ? frequencyMap.get(num) : 0;
                count++;
                frequencyMap.put(num, count);

                if (count > cont) {
                    cont = count;
                    max = num;
                }
            }

            System.out.println(max);
        }
    }
}
