import java.util.Scanner;

public class Add_Digits {
    public static int add(int num){
        if(num ==0){
            return 0;
        }
        return 1+(num-1) %9;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int num = sc.nextInt();
            
            System.out.println(Add_Digits.add(num));
            sc.close();
        }
    }
}
