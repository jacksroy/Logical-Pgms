import java.util.stream.IntStream;

public class App_2 {
    public static void main(String[] args) {
        printNumbers(1);

        //Approach 2 :using Java Streams
        IntStream.range(1,201).forEach(e->System.out.println(e));
    }
    public static void printNumbers(int num){
        if(num <=100){
            System.out.println(num);
            num ++;
            printNumbers(num); //Recursive call
        }
    }
}
