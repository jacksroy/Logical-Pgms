//Check is that year is leap or not

import java.util.Scanner;

public class Le {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if((num%4==0 && num%100!=0 )||( num%400==0)){
            System.out.println("Leap Year :" +num);
        }
        else {
            System.out.println("Year is not a Leap : "+num);
        }
        sc.close();
    }
    
}
