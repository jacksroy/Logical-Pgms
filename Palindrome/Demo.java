// Palindrome  number or not 

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num= sc.nextInt();
            int temp =num;
            int result =0;
            if(num < 0 ||(num!=0 && num%10 ==0 )){
                System.out.println(num+ " : Invalid input ");
                
            }
            else if(num<10){
                System.out.println(num +" : Palindrome Number");
            }
            else {while(num>0){
                int last =num%10;
                result = result *10 + last;
                num/=10;
            }
            System.out.println(result==temp ? temp + " : Palindrome Number" : temp + " : Not a Palindrome Number");
        }
            sc.close();
        }
        
    }
    
}
