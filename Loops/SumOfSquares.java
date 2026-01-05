import java.util.Scanner;
//sum of squares of first n natural numbers

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        n = Math.abs(n); // handle negative input

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        System.out.println(sum);
        sc.close();
    }
}
