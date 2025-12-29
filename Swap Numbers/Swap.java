import java.util.Scanner;
//Swapping the 2 numbers  using different approaches
class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swapping :" + a + ": " + b);

        // Approach 1: Using a temporary variable
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After Swapping  using third Variable:" + a + ": " + b);
        // Approach 2: Without using a temporary variable (using arithmetic operations)
        a= a +b; // for example if a=10 ,b=20   10+20=30
        b=a-b;  // b=30-20=10  
        a=a-b; // a=30-10=20
        System.out.println("After Swapping without temp variable using (+ and -) :" + a + ": " + b  );

        //Approach 3 : Without using 3rd variable using (arithmetic operations * and /)

        a=a*b; // for example if a=20 ,b=10   20*10=200
        b=a/b;  // b=200/10=20
        a=a/b; // a=200/20=10
        System.out.println("After Swapping without temp variable using (* and /) :" + a + ": " + b  );

        //Approach 4 : Without using 3rd variable using bitwise XOR operator
        a= a ^ b; // for example if a=10(1010) ,b=20(10100)   01010 ^ 10100=11110(30)
        b= a ^ b;  // b=11110 ^ 10100=01010(10)
        a= a ^ b; // a=11110 ^ 01010=10100(20)
        System.out.println("After Swapping without temp variable using XOR operator :" + a + ": " + b  );

        //Approach 5 : Using Java's built-in method
        Integer x = Integer.valueOf(a);
        Integer y = Integer.valueOf(b);
        Integer tempObj = x;    
        x = y;
        y = tempObj;    
        System.out.println("After Swapping using Java's built-in method :" + x + ": " + y  );

        //Approach 6 : single line swap using arithmetic operations
        a = a + b - (a= b); // a=20+10-(10)=20 , b=20
        System.out.println("After Swapping in single line using arithmetic operations :" + a + ": " + b  );
        sc.close();
    }
}