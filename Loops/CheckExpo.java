//Check is the number is an exponent of 2
import java.util.Scanner;
class CheckExpo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        sc.close();
        boolean isExpo = false;
        for(int i=0; i<=30; i++){
            if((1<<i) == num){
                isExpo = true;
                break;
            }
        }
        if(isExpo){
            System.out.println(num + " is an exponent of 2");
        } else {
            System.out.println(num + " is not an exponent of 2");
        }
    }
}