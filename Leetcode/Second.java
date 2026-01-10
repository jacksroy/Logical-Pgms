import java.util.Scanner;

//Leetcode Problem 2
// Palindrome Number or not
class Second {
    public static boolean isPalindrome(int x) {
        

        
        if(x <0){
            return false;
        }
        else if(x !=0 && x<9){
            return true;
        }
        String s =Integer.toString(x);
        int left =0;
        int right =s.length()-1;
        while(left <right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left ++;
            right --;

        }
        return true;
    }
    public static void main(String a[]){
        try(Scanner sc =new Scanner(System.in)){
            int x =sc.nextInt();
            
              boolean result =isPalindrome(x);
              System.out.println(result);
             

             
            sc.close();
        }
       
    }
}