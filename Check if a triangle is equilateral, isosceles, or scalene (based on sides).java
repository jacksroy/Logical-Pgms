import java.util.*;
public class Demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number 1:");
        int num =sc.nextInt();
        System.out.print("Enter Number 2:");
       int num1=sc.nextInt();
        System.out.print("Enter Number 3:");
       int num2=sc.nextInt();
       if(num == num1 && num == num2){
           System.out.println("equilateral");
       }
       else if(num == num1 || num == num2 || num1 == num2){
           System.out.println("isosceles");
       }
       else{
           System.out.println("Scalene ");
       }
        sc.close();
    }
}

// Enter Number 1:23
// Enter Number 2:9
// Enter Number 3:6
// Scalene 
