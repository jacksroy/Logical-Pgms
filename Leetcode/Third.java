//Reverse Integer with in the range of Integer without overflow
import java.util.Scanner;

class Third {
    public static int reverse(int x) {
      if(x <= Integer.MIN_VALUE || x>=Integer.MAX_VALUE){
        return 0;
      }
      int result =0;
      while(x!=0){
        result = result *10 + x%10;
        x/=10;
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