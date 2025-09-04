import java.util.*;
public class Demo{
    public static void main(String args[]){
        System.out.print("Enter Number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println(i);
        }
    }
}

//output
// Enter Number:7
// 1
// 2
// 3
// 4
// 5
// 6
// 7
