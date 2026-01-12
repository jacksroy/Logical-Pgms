
import java.util.Scanner;

class Power_Of_Two {

    public static boolean power(int x) {
        boolean result = false;
        if (x <= 0) {
            return false;
        }
        if ((x & (x - 1)) == 0) {
            result = true;
        }
        return result;

        //Approach 2 using Loops
        // class Solution {
        //     public boolean isPowerOfTwo(int n) {
        //         if (n <= 0) {
        //             return false;
        //         }
        //         while (n % 2 == 0) {
        //             n = n / 2;
        //         }
        //         return n == 1;
        //     }
        // }
        //Approach 3 using Recursion
        // class Solution {

        //     public boolean isPowerOfTwo(int n) {
        //         if (n == 1) {
        //             return true;
        //         }
        //         if (n <= 0 || n % 2 != 0) {
        //             return false;
        //         }

        //         return isPowerOfTwo(n / 2);
        //     }
        // }

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            boolean output = power(x);
            System.out.println(output);
            sc.close();
        }
    }
}
