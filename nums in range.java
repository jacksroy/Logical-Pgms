import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.print("Enter you Number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>=1 && num<=100){
            System.out.println("nymber is in between 1 to 100");
        }
        else{
            System.out.println("Number is Out of Range");
        }
        sc.close();
    }
}
//output
// Enter you Number:160
// Number is Out of Range
