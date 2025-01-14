import java.util.Scanner;

public class CompareTwoStrings {

    // Function to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {
        // Find the length of the two strings
        int len1 = str1.length();
        int len2 = str2.length();
        
        // Compare characters one by one
        int minLength = Math.min(len1, len2);
        
        for (int i = 0; i < minLength; i++) {
            // Compare corresponding characters of both strings
            if (str1.charAt(i) < str2.charAt(i)) {
                return -1;  // str1 is lexicographically smaller
            } else if (str1.charAt(i) > str2.charAt(i)) {
                return 1;   // str1 is lexicographically greater
            }
        }
        
        // If all characters are the same, compare the lengths
        if (len1 < len2) {
            return -1;  // str1 is shorter, so it's lexicographically smaller
        } else if (len1 > len2) {
            return 1;   // str1 is longer, so it's lexicographically greater
        }
        
        // Both strings are equal
        return 0;
    }

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for two strings
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        
        // Call the function to compare strings
        int result = compareStrings(str1, str2);
        
        // Print the result of the comparison
        if (result < 0) {
            System.out.println("The first string is lexicographically smaller.");
        } else if (result > 0) {
            System.out.println("The first string is lexicographically greater.");
        } else {
            System.out.println("Both strings are lexicographically equal.");
        }
        
        // Close the scanner to avoid resource leak
        sc.close();
    }
}
