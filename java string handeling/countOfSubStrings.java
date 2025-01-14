import java.util.Scanner;
public class countOfSubStrings {
        public static int countSubstringOccurrences(String str, String substring) {
            int count = 0;
            int index = 0;

            // Loop to search for the substring in the string
            while ((index = str.indexOf(substring, index)) != -1) {
                count++;  
                index++;  
                
            }
            return count;
        }

        public static void main(String[] args) {
            // Creating a scanner object to read user input
            Scanner sc = new Scanner(System.in);

            // showing user for the main string
            System.out.print("Enter the main string: ");
            String str = sc.nextLine();

            // showing user for the substring
            System.out.print("Enter the substring to search for: ");
            String substring = sc.nextLine();

            // Calling the function to count occurrences
            int count = countSubstringOccurrences(str, substring);

            // Printing the result
            System.out.println("The substring \"" + substring + "\" occurs " + count + " times in the string.");
            
        }
    }


