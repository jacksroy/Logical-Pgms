import java.util.*;
public class Demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Data:");
        char my_Char=sc.next().charAt(0);
        if("abcdefghijklmnopqrstuvwxyz".indexOf(my_Char) !=-1){
            System.out.println("Charcter is Lower case");
        }
        else if("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(my_Char)!=-1){
            System.out.println("Character is Upper Case");
        }
        else if("0123456789".indexOf(my_Char)!=-1){
            System.out.println("Character is digit");
        }
        else{
            System.out.println("It is Special Character");
        }
        sc.close();
    }
}
