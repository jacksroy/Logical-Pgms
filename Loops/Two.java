//Reverse and print one the even Numbers

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num > 0){
            int last =num%10;
            if(last %2==0){
                System.out.print(last);
            }
            num/=10;
        }
        sc.close();
    }
    
}
