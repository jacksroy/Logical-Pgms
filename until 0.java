import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;      // to store total sum
        int number;       // to store user input

        System.out.println("Enter numbers to sum (0 to stop):");

        // loop until user enters 0
        while(true) {
            System.out.print("Enter number: ");
            number = sc.nextInt();

            if(number == 0) {
                break;   // exit loop if number is 0
            }

            sum += number;  // add number to sum
        }

        System.out.println("Total sum = " + sum);

        sc.close();
    }
}

//output
// Enter numbers to sum (0 to stop):
// Enter number: 1
// Enter number: 2
// Enter number: 5
// Enter number: 

// 4
// Enter number: 6
// Enter number: 7
// Enter number: 
// 8
// Enter number: 0
// Total sum = 33
