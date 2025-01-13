
    import java.util.Scanner;
    public class ToLowerCaseConversion {


        // Method to convert a string to lowercase using ASCII values
        public static String convertToLowerCase(String input) {
            StringBuilder lowerCaseString = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);

                // Check if the character is an uppercase letter
                if (currentChar >= 'A' && currentChar <= 'Z') {
                    // Convert to lowercase by adjusting the ASCII value
                    currentChar = (char) (currentChar + 32);
                }

                lowerCaseString.append(currentChar);
            }

            return lowerCaseString.toString();
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

        // Method to split the input text into words and return a 2D array with words and their lengths
        public static String[][] splitTextIntoWords(String input) {
            // Split the input into words using space as the delimiter
            String[] words = input.split("\\s+");

            // Create a 2D array to store words and their lengths
            String[][] wordLengths = new String[words.length][2];

            for (int i = 0; i < words.length; i++) {
                wordLengths[i][0] = words[i]; // Word
                wordLengths[i][1] = String.valueOf(words[i].length()); // Length of word
            }

            return wordLengths;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking input from the user
            System.out.print("Enter a string: ");
            String inputText = scanner.nextLine();

            // Convert the input text to lowercase using String's toLowerCase() method
            String lowerCaseText = inputText.toLowerCase();

            // Manually convert the input text to lowercase using ASCII values
            String manualLowerCaseText = convertToLowerCase(inputText);

            // Compare both methods
            boolean isEqual = compareStrings(lowerCaseText, manualLowerCaseText);

            // Display the results of lowercase conversion and comparison
            System.out.println("\nOriginal Text: " + inputText);
            System.out.println("Lowercase using String.toLowerCase(): " + lowerCaseText);
            System.out.println("Lowercase using manual conversion: " + manualLowerCaseText);
            System.out.println("\nDo both methods produce the same result? " + (isEqual ? "Yes" : "No"));

            // Split the text into words and get their lengths
            String[][] wordsWithLengths = splitTextIntoWords(inputText);

            // Display the words along with their lengths
            System.out.println("\nWords and their lengths:");
            for (int i = 0; i < wordsWithLengths.length; i++) {
                System.out.println("Word: " + wordsWithLengths[i][0] + ", Length: " + wordsWithLengths[i][1]);
            }


        }
    }


