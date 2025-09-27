import java.util.*;

class Hollow {
    public static void main(String[] args) {
        System.out.println("Enter Row Value:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter Coloumn Value");
        int b = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if(i==1 || i ==a || j==1 || j==b){
                System.out.print("* ");}//one space after star
                else{
                    System.out.print( "  ");//make srue to make 2 spaces
                }

            }
            System.out.println();

        }
        sc.close();

    }
}
//output
// PS C:\REWORK\Java> javac Logical.java
// PS C:\REWORK\Java> java Logical      
// Enter Row Value:
// 5
// Enter Coloumn Value
// 5
// * * * * * 
// *       *
// *       *
// *       *
// * * * * *
