import java.sql.SQLOutput;
import java.util.Scanner;

public class Substring {
        // Method to create a substring using charAt() method
        public static String createSubstringUsingCharAt(String text, int start, int end) {
            StringBuilder substring = new StringBuilder();
            for (int i = start; i < end; i++) {
                substring.append(text.charAt(i));
            }
            return substring.toString();
        }

        // Method to compare two strings and return a boolean result
        public static boolean compareStrings(String str1, String str2) {
            return str1.equals(str2);
        }

        public static void main(String[] args) {
            // Create Scanner object to take input
            Scanner scanner = new Scanner(System.in);

            // Take user input for the original text and the start and end indices
            System.out.print("Enter the original text: ");
            String text = scanner.next();

            System.out.print("Enter the start index: ");
            int startIndex = scanner.nextInt();

            System.out.print("Enter the end index: ");
            int endIndex = scanner.nextInt();

            // Check for valid index range
            if (startIndex < 0 || endIndex > text.length() || startIndex >= endIndex) {
                System.out.println("Invalid index range!");
                return;
            }

            // Create the substring using charAt() method
            String substringUsingCharAt = createSubstringUsingCharAt(text, startIndex, endIndex);

            // Create the substring using the built-in substring() method
            String substringUsingBuiltInMethod = text.substring(startIndex, endIndex);

            // Display both substrings
            System.out.println("Substring using charAt(): " + substringUsingCharAt);
            System.out.println("Substring using built-in substring() method: " + substringUsingBuiltInMethod);

            // Compare the substrings and display the result
            boolean areEqual = compareStrings(substringUsingCharAt, substringUsingBuiltInMethod);
            if (areEqual) {
                System.out.println("Both substrings are equal.");
            } else {
                System.out.println("Both substrings are NOT equal.");
            }



    }
}
