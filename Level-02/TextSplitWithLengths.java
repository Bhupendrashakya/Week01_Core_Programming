import java.util.Scanner;

public class TextSplitWithLengths {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();
        
        // Calling user-defined method to split the text
        String[] words = customSplit(inputText);
        
        // Calling method to generate a 2D array with word and its length
        String[][] wordWithLengths = getWordsAndLengths(words);
        
        // Displaying the results in tabular format
        System.out.println("\nWord and Length Table:");
        System.out.printf("%-15s %-10s\n", "Word", "Length");
        for (String[] wordLength : wordWithLengths) {
            System.out.printf("%-15s %-10d\n", wordLength[0], Integer.parseInt(wordLength[1]));
        }
    }
    
    // Method to split the text into words using charAt() without using split()
    public static String[] customSplit(String text) {
        int textLength = findStringLength(text);
        
        // Count the number of words by finding spaces
        int wordCount = 0;
        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++;  // Adding 1 for the last word
        
        // Create an array to store the words
        String[] words = new String[wordCount];
        int startIdx = 0;
        int wordIdx = 0;
        
        // Extract words using space
        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIdx++] = text.substring(startIdx, i);
                startIdx = i + 1;
            }
        }
        
        // Add the last word
        words[wordIdx] = text.substring(startIdx);
        
        return words;
    }

    // Method to find the length of the string without using the built-in length() method
    public static int findStringLength(String str) {
        int length = 0;
        while (true) {
            try {
                str.charAt(length);
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return length;
    }

    // Method to return a 2D array of words and their corresponding lengths
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] wordWithLengths = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            wordWithLengths[i][0] = words[i];                // Store word
            wordWithLengths[i][1] = String.valueOf(words[i].length()); // Store length as string
        }
        
        return wordWithLengths;
    }
}
