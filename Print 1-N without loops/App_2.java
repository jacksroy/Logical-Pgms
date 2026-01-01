import java.util.Scanner;
import java.util.stream.IntStream;

public class App_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int last =scanner.nextInt();
        
        printNumbers(num,last);

        //Approach 2 :using Java Streams
        IntStream.range(1,25).forEach(e->System.out.println(e));
        //Approach 3 :using Java Streams
        IntStream.rangeClosed(1, 18).forEach(System.out::println);
        scanner.close();
    }
    public static void printNumbers(int num,int last){
        
        if(num <=last){
            System.out.println(num);
            num ++;
            printNumbers(num,last); //Recursive call
        }
    }
}
