import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:");
        int num=sc.nextInt();
        int result=0;
        if(num%2==0){
            System.out.println("yes 2");
        }
        if(num%3==0){
            System.out.println("yes 3");
        }
          if(num%4==0){
            System.out.println("yes 4");
        }
          if(num%5==0){
            System.out.println("yes 5");
        }
        result=1+2+3;
        
        if(num==result){
            System.out.println("Prefect number");
        }
        else{
            System.out.println("Not Prefect number");
        }

        
    }
}

// Enter Number:6
// yes 2
// yes 3
// Prefect number
