import java.util.Scanner;
public class ToUpperCaseConversion {
        // Method to convert a string to uppercase using ASCII values
        public static String convertToUpperCase(String input) {
            StringBuilder upperCaseString = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);

                // Check if the character is a lowercase letter
                if (currentChar >= 'a' && currentChar <= 'z') {
                    // Convert to uppercase by adjusting the ASCII value
                    currentChar = (char) (currentChar - 32);
                }

                upperCaseString.append(currentChar);
            }

            return upperCaseString.toString();
        }

        // Method to compare two strings using charAt()
        public static boolean compareStrings(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return false;
            }

            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking input from the user
            System.out.print("Enter a string: ");
            String inputText = scanner.nextLine();

            // Convert the input text to uppercase using String's toUpperCase() method
            String upperCaseText = inputText.toUpperCase();

            // Manually convert the input text to uppercase using ASCII values
            String manualUpperCaseText = convertToUpperCase(inputText);

            // Compare both methods
            boolean isEqual = compareStrings(upperCaseText, manualUpperCaseText);

            // Display the results
            System.out.println("\nOriginal Text: " + inputText);
            System.out.println("Uppercase using String.toUpperCase(): " + upperCaseText);
            System.out.println("Uppercase using manual conversion: " + manualUpperCaseText);
            System.out.println("\nDo both methods produce the same result? " + (isEqual ? "Yes" : "No"));

            scanner.close();
        }
    }


