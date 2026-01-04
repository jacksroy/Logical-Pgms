//Find tge second largest element in an array

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();

        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j] + " ");
            System.out.println("-----------------------------");
        }
        int highest = arr[0];
        int secondHighest = arr[0];

        if (arr.length < 2) {
            System.out.println("Invalid Input");
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            } else if (secondHighest > arr[i]) {
                secondHighest = arr[i];
            }
        }
        System.out.println(secondHighest + "Second Highest");


        //Approach 2
        // int highest = Integer.MIN_VALUE;
        // int secondHighest = Integer.MIN_VALUE;

        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] > highest) {
        //         secondHighest = highest; // Old king becomes second
        //         highest = arr[i]; // New king
        //     } else if (arr[i] > secondHighest && arr[i] != highest) {
        //         secondHighest = arr[i]; // New second king
        //     }
        // }

        sc.close();
    }
}
