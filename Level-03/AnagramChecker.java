import java.util.Scanner;
// Creating a Class AnagramChecker to check if two texts are anagrams
public class AnagramChecker 
{

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false; // Texts are of different lengths
        }

        int[] frequency1 = new int[256]; // Array to store frequency of characters in text1
        int[] frequency2 = new int[256]; // Array to store frequency of characters in text2

        // Loop to find the frequency of characters in text1
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
        }

        // Loop to find the frequency of characters in text2
        for (int i = 0; i < text2.length(); i++) {
            frequency2[text2.charAt(i)]++;
        }

        // Compare the frequency arrays
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false; // Frequencies do not match
            }
        }

        return true; // Texts are anagrams
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two texts
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine(); // Store the first text

        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine(); // Store the second text

        // Check if the texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        System.out.println("Are the texts anagrams? " + result);
    }
}