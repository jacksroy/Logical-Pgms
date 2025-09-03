import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.print("Enter you Number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>=90 && num<=100){
            System.out.println("Grade A");
        }
        else if(num>=75 && num<90 ){
            System.out.println("Grade B");
        }
        else if(num>=60 && num <75){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Grade F");
        }
        sc.close();
    }
}

//output
// Enter you Number:17
// Grade F
