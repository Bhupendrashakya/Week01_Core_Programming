import java.util.Scanner; // Importing the Scanner class to read user input

// Creating the class VowelConsonantCheckerImproved to find vowels and consonants in a string and display their character type
public class VowelConsonantCheckerImproved 
{

    // Creating the method checkCharacter to check if the character is a vowel, consonant, or not a letter
    public static String checkCharacter(char ch)
	{
        // Converting the character to lowercase if it is an uppercase letter
        ch = Character.toLowerCase(ch);
        
        // Checking if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
		{
            return "Vowel";
        }
        // Checking if the character is a consonant
        else if (ch >= 'a' && ch <= 'z') 
		{
            return "Consonant";
        }
        // Returning "Not a Letter" for non-alphabetic characters
        else 
		{
            return "Not a Letter";
        }
    }

    // Creating the method findCharacterTypes to find vowels and consonants in a string and return their character types in a 2D array
    public static String[][] findCharacterTypes(String str) 
	{
        // Creating a 2D array to store the characters and their types
        String[][] result = new String[str.length()][2];

        // Iterating through each character in the string
        for (int i = 0; i < str.length(); i++) 
		{
            // Storing the character
            result[i][0] = String.valueOf(str.charAt(i));
            // Storing the character type (Vowel, Consonant, or Not a Letter)
            result[i][1] = checkCharacter(str.charAt(i));
        }

        // Returning the 2D array of characters and their types
        return result;
    }

    // Creating the method displayCharacterTypes to display the 2D array of characters and their types in a tabular format
    public static void displayCharacterTypes(String[][] characterTypes) 
	{
        // Displaying the table headers
        System.out.println("Character\tType");

        // Iterating through the 2D array and displaying each character and its type
        for (String[] characterType : characterTypes) 
		{
            System.out.println(characterType[0] + "\t\t" + characterType[1]);
        }
    }

    public static void main(String[] args) 
	{
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a string
        System.out.print("Enter the string: ");
        // Creating a String variable userInput to store the user input
        String userInput = scanner.nextLine();

        // Calling the findCharacterTypes method to find the character types in the string
        String[][] characterTypes = findCharacterTypes(userInput);

        // Displaying the character types in a tabular format
        displayCharacterTypes(characterTypes);

        // Closing the Scanner object to free up resources
        scanner.close();
    }
}