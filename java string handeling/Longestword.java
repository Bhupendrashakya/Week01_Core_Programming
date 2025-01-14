import java.util.Scanner;
public class Longestword {

        // Function to find the longest word in the sentence
        public static String findLongestWord(String sentence) {
            // Split the sentence into words using space as delimiter
            String[] words = sentence.split(" ");

            // Initialize a variable to store the longest word
            String longestWord = "";

            // Iterate over each word to find the longest one
            for (String word : words) {
                // If the current word is longer than the longestWord found so far, update longestWord
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            // Return the longest word
            return longestWord;
        }

        public static void main(String[] args) {
            // Create a scanner object to read user input
            Scanner sc = new Scanner(System.in);

            // Prompt user for a sentence
            System.out.println("Enter a sentence: ");
            String sentence = sc.nextLine();  // Read the entire line of input

            // Call the function to find the longest word
            String longestWord = findLongestWord(sentence);

            // Print the longest word
            System.out.println("The longest word is: " + longestWord);


        }
    }


