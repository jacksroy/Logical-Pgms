import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.print("Enter Year:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%400 ==0 || num%4==0 && num%100 !=0){
            System.out.println("leap");
        }
        else{
            System.out.println("not leap");
        }
       
    }
}

//Enter Year:2024
//leap
