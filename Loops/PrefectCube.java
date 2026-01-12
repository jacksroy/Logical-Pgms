import java.util.Scanner;

public class PrefectCube {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int  num =sc.nextInt();
            num =Math.abs(num);
            boolean res =false;
            for(int i=1;i<num;i++){
                if(i*i*i ==num){
                    res =true;
                    break;
                }
            }
            if(res){
                System.out.println("Prefect cube root");
            }
            else {
                System.out.println("not a Prefect Cube root");
            }
        }
    }
}
