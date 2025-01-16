import java.util.Scanner;

public class SplitText {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();
        
        // Calling user-defined method to split the text
        String[] customSplitWords = customSplit(inputText);
        
        // Calling built-in split() method to split the text
        String[] builtInSplitWords = inputText.split("\\s+"); // Split by one or more spaces
        
        // Comparing both results and displaying the comparison
        boolean isSame = compareWordArrays(customSplitWords, builtInSplitWords);
        
        System.out.println("\nCustom Split Words: ");
        for (String word : customSplitWords) {
            System.out.println(word);
        }
        
        System.out.println("\nBuilt-In Split Words: ");
        for (String word : builtInSplitWords) {
            System.out.println(word);
        }
        
        System.out.println("\nAre the results of custom split and built-in split the same? " + isSame);
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
    
    // Method to split the text into words using charAt() method without using split()
    public static String[] customSplit(String text) {
        int textLength = findStringLength(text);
        
        // Count the number of words by finding spaces
        int wordCount = 0;
        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++;  // Adding 1 for the last word which doesn't end with a space
        
        // Create an array to store the indexes of spaces (split points)
        int[] spaceIndexes = new int[wordCount - 1];  // We only need to store indexes of spaces
        int spaceIndex = 0;
        
        // Store space indexes
        for (int i = 0; i < textLength; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex++] = i;
            }
        }
        
        // Create an array to store the words
        String[] words = new String[wordCount];
        int startIdx = 0;
        int wordIdx = 0;
        
        // Extract words using space indexes
        for (int i = 0; i < spaceIndexes.length; i++) {
            words[wordIdx++] = text.substring(startIdx, spaceIndexes[i]);
            startIdx = spaceIndexes[i] + 1;
        }
        
        // Add the last word
        words[wordIdx] = text.substring(startIdx);
        
        return words;
    }
    
    // Method to compare two word arrays and return a boolean result
    public static boolean compareWordArrays(String[] array1, String[] array2) {
        // If the lengths of both arrays are different, they are not equal
        if (array1.length != array2.length) {
            return false;
        }
        
        // Compare the elements of both arrays
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        
        return true;
    }
}
