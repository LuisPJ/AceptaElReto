import java.util.Scanner;

public class problem_164 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                int x1 = scanner.nextInt();
                int y1 = scanner.nextInt();
                int x2 = scanner.nextInt();
                int y2 = scanner.nextInt();

                if (x1 > x2 || y1 > y2) {
                    break;
                }

                int area = (x2 - x1) * (y2 - y1);
                System.out.println(area);
            }
        }
    }
}
