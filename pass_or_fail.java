import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.print("Enter you Number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>=35 && num<=100){
            System.out.println("Pass");}
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}

//output
// Enter you Number:67
// Pass
