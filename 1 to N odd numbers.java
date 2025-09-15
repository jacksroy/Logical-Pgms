import java.util.*;
class Demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number:");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}

//output
// Enter The Number:10
// 1 3 5 7 9 
