import java.util.Scanner;

// Creating a Class CharacterFrequency to find the frequency of characters in a string
 class CharacterFrequency 
{

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String text) 
	{
        char[] characters = text.toCharArray(); // Convert the string to a character array
        int length = characters.length;
        int[] frequency = new int[length]; // Array to store the frequency of each character
        
        // Loop to find the frequency of each character
        for (int i = 0; i < length; i++) {
            frequency[i] = 1;
            for (int j = i + 1; j < length; j++) 
			{
                if (characters[i] == characters[j] && characters[i] != '0') {
                    frequency[i]++;
                    characters[j] = '0'; // Set duplicate characters to '0'
                }
            }
        }
        
        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                uniqueCount++;
            }
        }

        // Create an array to store the characters and their frequencies
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                result[index] = characters[i] + " = " + frequency[i];
                index++;
            }
        }

        return result; // Return the array with characters and their frequencies
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine(); // Store the user input

        // Find the frequency of characters in the input string
        String[] characterFrequency = findCharacterFrequency(userInput);

        // Display the result
        System.out.println("Character Frequencies:");
        for (String result : characterFrequency) 
		{
            System.out.println(result);
        }
    }
}