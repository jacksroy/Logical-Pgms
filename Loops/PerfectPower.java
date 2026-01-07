import java.util.Scanner;

public class PerfectPower {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            if (n < 4) {
                System.out.println("Not a Perfect Power");
                return;
            }

            boolean isPerfectPower = false;

            for (int base = 2; base * base <= n; base++) {
                long value = base * base;

                while (value <= n) {
                    if (value == n) {
                        isPerfectPower = true;
                        break;
                    }
                    value *= base;
                }

                if (isPerfectPower) {
                    break;
                }
            }

            if (isPerfectPower) {
                System.out.println("Perfect Power");
            } else {
                System.out.println("Not a Perfect Power");
            }

            sc.close();
        }
    }
}
