import java.util.Scanner;

// Creating class ReplaceWord to replace a word in a sentence with another word
public class ReplaceWord 
{

    // Method to replace a word in a sentence with another word
    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        // Check if any of the input strings are null and return the original sentence if they are
        if (sentence == null || wordToReplace == null || replacementWord == null) 
		{
            return sentence;
        }
        // Replace the word in the sentence and return the result
        return sentence.replace(wordToReplace, replacementWord);
    }

    public static void main(String[] args) 
	{
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the sentence
        System.out.print("Enter the sentence : ");
        // Create a String variable to store the sentence input by the user
        String sentence = scanner.nextLine();

        // Prompt the user to enter the word to replace
        System.out.print("Enter the word to replace : ");
        // Create a String variable to store the word to replace input by the user
        String wordToReplace = scanner.nextLine();

        // Prompt the user to enter the replacement word
        System.out.print("Enter the replacement word	:	");
        // Create a String variable to store the replacement word input by the user
        String replacementWord = scanner.nextLine();

        // Call the replaceWord method and store the result
        String result = replaceWord(sentence, wordToReplace, replacementWord);

        // Print the resulting sentence
        System.out.print("Resulting sentence	:	");
        System.out.println(result);

        // Close the Scanner object to free up resources
        scanner.close();
    }
}