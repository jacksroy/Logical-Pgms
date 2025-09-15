import java.util.*;
class Demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number:");
        int number=sc.nextInt();
        int sum=0;
        while(number>0){
            int temp=number%10;
            sum=sum*10+temp;
            number/=10;
            
            
        }
        System.out.print("Reversed of number:"+sum);
        
        
           
            
        
    }
}
//output
//Enter The Number:1234
// Reversed of number:4321
