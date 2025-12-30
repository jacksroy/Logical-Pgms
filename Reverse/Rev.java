import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");
        int num = sc.nextInt();
        int rev =0;

        //Approach 1: Using while loop
        while(num != 0){
            rev=rev*10 +num%10;
            num/=10;
        }
        System.out.println("Reversed number: " + rev);

        //Approach 2: Using StringBuffer
        System.out.println("Enter a number to reverse using String Buffer: ");
        int num1 = sc.nextInt(); 
        StringBuffer sb =new StringBuffer(String.valueOf(num1)); //String.valueOf() method converts int to String
        StringBuffer rev1 =sb.reverse();//StringBuffer class has a built-in method reverse() to reverse the string we create the StringBuffer object 
        System.out.println("Reverse using String Buffer :" +rev1);

        //Approach 3: Using StringBuilder
        System.out.println("Enter a number to reverse using String Builder: ");
        int num2 = sc.nextInt();
        StringBuilder sbl= new StringBuilder();
        sbl.append(num2); //append() method is used to add the int value to StringBuilder object
        StringBuilder rev2 = sbl.reverse(); //StringBuilder class also has a built-in method reverse() to reverse the string
        System.out.println("Reverse using String Builder :" +rev2);
        sc.close();
        
    }
}