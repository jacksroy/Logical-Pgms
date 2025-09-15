import java.util.*;
class Demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number:");
        int number=sc.nextInt();
        int sum=0;
        while(number>0){
            int temp=number%10;
            sum+=temp;
            number/=10;
        }
        System.out.println("Sum:"+sum);
           
            
        
    }
}
//output
// Enter The Number:1254
// Sum:12
