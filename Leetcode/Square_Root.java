//Find Square Root a number using Binary search
import java.util.Scanner;

class Square_Root {
    public static  int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int left = 1;
        int right = x;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // use long to avoid overflow
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            }
            else if (square < x) {
                ans = mid;        // mid is a possible answer
                left = mid + 1;   // try to find bigger
            }
            else {
                right = mid - 1;  // square too big
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int output =mySqrt(x);
            System.out.println(output);
            sc.close();
        }
    }
}   




// import java.util.Scanner;

// class Square_Root {
//     public static int mySqrt(int x){
//         // int result =(int)Math.sqrt(x);
//         long result =0;
//         for(long i=0;i<=x;i++){
//             if(i *i <=x){
//                 result =i;
//             }
//             else {
//                 break;
//             }


//         }
//         return (int) result;
//         // return result;
//     }
//     public static void main(String[] args) {
//         try(Scanner sc =new Scanner(System.in)){
//             int x =sc.nextInt();
//             int output =mySqrt(x);
//             System.out.println(output);
//             sc.close();
//         }
//     }

// }