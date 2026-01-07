
import java.util.Scanner;

//Check the String is Palindrome or not


public class PalString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str =sc.next();
            str= str.toLowerCase();
            String rev="";
            if(str.length() == 1){
                System.out.println(str);
            }
            for(int i=str.length()-1;i>=0;i--)
            {
                rev += str.charAt(i);
            }
           
            System.out.println(str.equals(rev)? str +" : Palindrome" : " : Not A Palindrome");
            sc.close();
        }
    }
    
}
