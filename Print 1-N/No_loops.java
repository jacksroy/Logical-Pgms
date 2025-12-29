
//Print 1-N without using loops
public class No_loops {
    static void print1toN(int n) {
        // Base case
        if (n > 18) {  //here n is initially 1 and we want to print till 18 condition false and return not thing 
            return;
        }
        System.out.println(n); // and n is printed
        // Recursive call
        print1toN(n + 1); // n is incremented by 1 and function is called again
    }
    public static void main(String[] args) {
        print1toN(10);  // Starting the printing from 10
    }
    
}
