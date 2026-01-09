import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("Not a perfect square");
                return;
            }

            boolean isPerfectSquare = false;

            for (int i = 0; i * i <= num; i++) {
                if (i * i == num) {
                    isPerfectSquare = true;
                    break;
                }
            }

            if (isPerfectSquare) {
                System.out.println("Perfect square");
            } else {
                System.out.println("Not a perfect square");
            }

            sc.close();
        }
    }
}
