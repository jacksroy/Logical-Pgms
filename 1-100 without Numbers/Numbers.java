
// Printing numbers from 1 to 100 without using any numeric characters
public class Numbers {
    public static void main(String[] args) {

        //approach 1: 
        int one='B'/'B'; // i=66/66=1
        String s = ".........."; // string of length 10
        for(int i=one;i<=s.length()*s.length();i++) { // loop from 1 to 100
            System.out.println(i);
        }
        System.out.println("---------------------------------------------");
        //approach 2:
        for(int i='B'/'B';i<='d';i++){  //here the ASCII value of 'd' is 100   so it is based on ascii values
            System.out.println(i);
        }
    }
}
