import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.print("Enter you Number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Do you has Driving License(yes/No)");
        String st=sc.next().trime().toLowerCase();
        if(num>=18 && st.equals("yes")){
            System.out.println("Eligiable for Driveing");}
        else{
            System.out.println("not eligiable for driving");
        }
        sc.close();
    }
}
//output
// Enter you Number:19
// Do you has Driving License(yes/No)

// NO
// not eligiable for driving
