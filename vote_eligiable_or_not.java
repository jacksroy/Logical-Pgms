import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.print("Enter you Number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>=18){
            System.out.println("Eligiable for vote");}
        else{
            System.out.println("not eligiable for vote");
        }
        sc.close();
    }
}

//output
// Enter you Number:9
// not eligiable for vote
