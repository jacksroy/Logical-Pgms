// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.print("Enter number_1:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
         System.out.print("Enter number_2:");
        
        int num_1=sc.nextInt();
        if(num%num_1==0){
            System.out.println("Number is  Divisible");
        }
       
        else{
            System.out.println("Number is not Divisible");
        }
       
    }
}

//Enter number_1:2
//Enter number_2:3
//Number is not Diviable
