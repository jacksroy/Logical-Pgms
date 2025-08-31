import java.util.*;
public class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number 1:");
        int num=sc.nextInt();
        System.out.print("Enter Number 2:");
        int num1=sc.nextInt();
        if(num %num1 ==0){
            System.out.println(num+"  multiple of "+num1);
        }
        else{
            System.out.println(num+" is not Multiple of "+num1);
        }
        sc.close();
    }
}
//output
// Enter Number 1:5
// Enter Number 2:6
// 5 is not Multiple of 6
