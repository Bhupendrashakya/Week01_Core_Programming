import java.util.*;
public class ArrayIndexOutOfBounds {
        // Method to generate the ArrayIndexOutOfBoundsException
        public static void generateException(String[] names) {
            System.out.println("Trying to access index " +names.length+1+" (which is out of bounds):");
            System.out.println(names[names.length+1]); // This will cause ArrayIndexOutOfBoundsException
        }

        // Method to handle ArrayIndexOutOfBoundsException and other runtime exceptions
        public static void handleException(String[] names) {
            try {
                // This will attempt to generate the exception
                generateException(names);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println("Caught a generic RuntimeException: " + e.getMessage());
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking input from the user to fill the array
            System.out.print("Enter the number of names you want to input: ");
            int size = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            String[] names = new String[size];
            System.out.println("Enter " + size + " names:");

            // Taking names as input
            for (int i = 0; i < size; i++) {
                names[i] = scanner.nextLine();
            }

            

             // Call the method to handle the exception
             System.out.println("\nHandling the exception with try-catch:");
             handleException(names);




        }
    }


