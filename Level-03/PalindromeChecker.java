import java.util.*;
public class PalindromeChecker
{

    // Logic 1: Compare characters from the start and end of the string
    public static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // Characters do not match
            }
            start++;
            end--;
        }

        return true; // Text is a palindrome
    }

    // Logic 2: Recursive method to compare characters
    public static boolean isPalindromeLogic2(String text, int start, int end) {
        if (start >= end) {
            return true; // Reached the middle of the text
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false; // Characters do not match
        }

        return isPalindromeLogic2(text, start + 1, end - 1); // Recursive call
    }

    // Logic 3: Compare characters using character arrays
    public static boolean isPalindromeLogic3(String text) {
        char[] original = text.toCharArray();
        char[] reverse = new char[original.length];

        // Create the reverse array
        for (int i = 0; i < original.length; i++) {
            reverse[i] = original[original.length - 1 - i];
        }

        // Compare original and reverse arrays
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false; // Characters do not match
            }
        }

        return true; // Text is a palindrome
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a text: ");
        String userInput = scanner.nextLine(); // Store the user input

        // Check if the text is a palindrome using three different logics
        boolean resultLogic1 = isPalindromeLogic1(userInput);
        boolean resultLogic2 = isPalindromeLogic2(userInput, 0, userInput.length() - 1);
        boolean resultLogic3 = isPalindromeLogic3(userInput);

        // Display the results
        System.out.println("Is the text a palindrome (Logic 1)? " + resultLogic1);
        System.out.println("Is the text a palindrome (Logic 2)? " + resultLogic2);
        System.out.println("Is the text a palindrome (Logic 3)? " + resultLogic3);
    }
}