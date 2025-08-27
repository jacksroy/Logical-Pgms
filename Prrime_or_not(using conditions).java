import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:");
        int num=sc.nextInt();
        if(num == 2 || num ==3 || num==5 || num==7){
            System.out.println("Prime Number");
        }
        else if (num%2==0 || num%3==0 ||num%5==0|| num%7==0){
            System.out.println("Not Prime");
        }
        
        else{
            System.out.println("Prime number");
        }
    }
}

//output
//Enter Number:12
//Not Prime
