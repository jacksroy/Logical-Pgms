//Find tge second largest element in an array

import java.util.Scanner;

public class Second_ {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();

            }
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j] + " ");
                System.out.println("-----------------------------");
            }

            if (arr.length < 2) {
                System.out.println("Invalid Input");
                return;
            }



            //Approach 2
            int highest = Integer.MIN_VALUE;
            int secondHighest = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > highest) {
                    secondHighest = highest; // Old king becomes second
                    highest = arr[i]; // New king
                } else if (arr[i] > secondHighest && arr[i] != highest) {
                    secondHighest = arr[i]; // New second king
                }
            }
            System.out.println(secondHighest + " : Second Highest");

            sc.close();
        }
    }
}
