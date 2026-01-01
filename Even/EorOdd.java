// check number is even or odd

import java.util.Scanner;

public class EorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // String str = num %2==0 ? "Even" : "Odd";
        String str = num%2!=0 ? "Odd" :"Even";
        System.out.println(str);
        sc.close();
    }
    
}
