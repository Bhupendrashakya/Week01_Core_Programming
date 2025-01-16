import java.util.Scanner; // Importing the Scanner class to read user input

// Creating the class VowelConsonantCounter to find vowels and consonants in a string and display their count
public class VowelConsonantCounter 
{

    // Creating the method checkCharacter to check if the character is a vowel, consonant, or not a letter
    public static String checkCharacter(char ch) 
	{
        // Converting the character to lowercase if it is an uppercase letter
        ch = Character.toLowerCase(ch);
        
        // Checking if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Checking if the character is a consonant
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        // Returning "Not a Letter" for non-alphabetic characters
        else 
		{
            return "Not a Letter";
        }
    }

    // Creating the method countVowelsAndConsonants to find vowels and consonants in a string and return their count
    public static int[] countVowelsAndConsonants(String str) 
	{
        // Creating an array to store the count of vowels and consonants
        int[] count = {0, 0}; // count[0] for vowels, count[1] for consonants

        // Iterating through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Checking the character and updating the count accordingly
            String result = checkCharacter(str.charAt(i));
            if (result.equals("Vowel"))
			{
                count[0]++;
            } 
			else if (result.equals("Consonant")) 
			{
                count[1]++;
            }
        }

        // Returning the count array
        return count;
    }

    public static void main(String[] args) 
	{
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a string
        System.out.print("Enter the string: ");
        // Creating a String variable userInput to store the user input
        String userInput = scanner.nextLine();

        // Calling the countVowelsAndConsonants method to find the count of vowels and consonants
        int[] count = countVowelsAndConsonants(userInput);

        // Displaying the result
        System.out.println("Number of Vowels: " + count[0]);
        System.out.println("Number of Consonants: " + count[1]);

        // Closing the Scanner object to free up resources
        scanner.close();
    }
}