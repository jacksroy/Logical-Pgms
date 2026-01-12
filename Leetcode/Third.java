//Reverse Integer with in the range of Integer without overflow
import java.util.Scanner;

class Third {
    public static int reverse(int x) {
      
      
      int result =0;
      while(x!=0){
        int pop = x %10;
         x/=10;
        //check for overflow
        if(result > Integer.MAX_VALUE/10 ||result ==Integer.MAX_VALUE/10 && pop >7) return 0;
        if (result < Integer.MIN_VALUE/10 || result == Integer.MIN_VALUE/10 && pop < -8){
          return 0;
        }
        result = result *10 + pop;
       
      }
      return result;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            int x=sc.nextInt();
            int result = reverse(x);
            System.out.println(result);
            sc.close();
        }
        

    }
}