//The First Unique Character

import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            int index = firstUniqueCharacter(input);
            if (index != -1) {
                System.out.println("The index of the first unique character is: " + index);
            } else {
                System.out.println("There are no unique characters in the string.");
            }
            scanner.close();
        }
    }

    public static int firstUniqueCharacter(String s) {
        int[] charCount = new int[26];
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}