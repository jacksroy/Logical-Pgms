//Reverse the String using some Approaches

import java.util.Scanner;

public class Sri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String Reverse ="";

        //Approach 1 using String Concatenation
        for(int i=str.length()-1;i>=0;i--){  // first length -1 is taken and check the character and return
            Reverse +=str.charAt(i);
        }
        System.out.println("Reversed string:"+Reverse );

        //Approach 2 using character Array
        char arr[] =str.toCharArray(); 
        String Reverse1 ="";
        for(int i=arr.length-1;i>=0;i--){
           Reverse1 +=arr[i];
        }
        System.out.println("Reversed string using char array:" +Reverse1 );

        //Approach 3 using String Buffer

        StringBuffer sb = new StringBuffer(str);
        System.out.println("Reversed String using String Buffer :" +sb.reverse());

        sc.close();
    }
    
}
