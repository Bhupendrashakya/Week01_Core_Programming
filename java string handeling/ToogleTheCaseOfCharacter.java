import java.util.Scanner;
public class ToogleTheCaseOfCharacter {

        // Function to toggle the case of each character in a string
        public static String toggleCase(String str) {
            // Use StringBuilder to build the result string
            StringBuilder result = new StringBuilder();

            // Loop through each character in the string
            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);

                // Check if the character is uppercase or lowercase and toggle its case
                if (Character.isUpperCase(currentChar)) {
                    result.append(Character.toLowerCase(currentChar));  // Convert to lowercase
                } else if (Character.isLowerCase(currentChar)) {
                    result.append(Character.toUpperCase(currentChar));  // Convert to uppercase
                } else {
                    result.append(currentChar);  // Non-alphabetic characters remain unchanged
                }
            }

            // Return the result as a string
            return result.toString();
        }

        public static void main(String[] args) {
            // Create a scanner object to read user input
            Scanner sc = new Scanner(System.in);

            // Prompt user for input string
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            // Call the function to toggle the case
            String toggledString = toggleCase(str);

            // Print the result
            System.out.println("String after toggling case: " + toggledString);

            // Close the scanner to avoid resource leak
            sc.close();
        }
    }


