import java.util.Scanner;

// Creating a Class CharacterFrequencyFinderImproved to find the frequency of characters in a string
class CharacterFrequencyFinderImproved {

    // Method to find unique characters in a string using charAt() method
    public static char[] findUniqueCharacters(String text) {
        int length = text.length(); // Get the length of the text
        char[] uniqueChars = new char[length]; // Array to store unique characters
        int uniqueCount = 0;

        // Loop to find unique characters
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i); // Get the current character
            boolean isUnique = true;
            // Check if currentChar is unique
            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false; // If character is found before, it is not unique
                    break;
                }
            }
            // If unique, store it in the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array to store the unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }
        return result; // Return the array of unique characters
    }

    // Method to find the frequency of characters in a string using unique characters
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; // Array to store the frequency of characters
        int length = text.length();

        // Loop to find the frequency of characters in the text
        for (int i = 0; i < length; i++) {
            frequency[text.charAt(i)]++;
        }

        // Finding unique characters in the text
        char[] uniqueChars = findUniqueCharacters(text);

        // Creating a 2D array to store the unique characters and their frequencies
        String[][] charFrequency = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            charFrequency[i][0] = Character.toString(uniqueChars[i]);
            charFrequency[i][1] = Integer.toString(frequency[uniqueChars[i]]);
        }
        return charFrequency; // Return the 2D array with characters and their frequencies
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine(); // Store the user input

        // Finding the frequency of characters in the input string
        String[][] characterFrequency = findCharacterFrequency(userInput);

        // Displaying the result
        System.out.println("Character | Frequency");
        for (int i = 0; i < characterFrequency.length; i++) {
            System.out.println("    " + characterFrequency[i][0] + "      |     " + characterFrequency[i][1]);
        }
    }
}