//Square root of a Number

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num =sc.nextInt();
        int power =2;
        for(int i=1;i<power;i++){
            num= num *num;
        }
        System.out.println(num);
        sc.close();

    }
}
