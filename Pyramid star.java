public class Star {
    public static void main(String args[]){
        int n = 4;

        for(int i = 1; i <= n; i++){          // Outer loop → rows
            // Print spaces
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }

            // Print stars
            for(int j = 1; j <= 2*i -1; j++){
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}
//output

//   *
//   ***
//  *****
// *******

