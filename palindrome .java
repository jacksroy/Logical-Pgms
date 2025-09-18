import java.util.*;
class Demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number:");
        int number=sc.nextInt();
        int origin =number;
        int sum=0;
        while(number>0){
            int temp=number%10;
            sum=sum*10+temp;
            number/=10;
            
            
        }
        if(origin == sum )
        System.out.println("Palindrome number");
        else
        System.out.print("Palindrome not");
        
        
           
            
        
    }
}
//output
// Enter The Number:123
// Palindrome not
