//Table printing with conditions

import java.util.Scanner;

public class Ta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mul=0;
        for(int i=1;i<=100;i++){
            mul =num*i;
            
           
            if (mul %5==0) {
                continue;
                }
            if (mul >50) {
                    break;}
            System.out.println(mul);
            
        }
        sc.close();
        
    }
}
