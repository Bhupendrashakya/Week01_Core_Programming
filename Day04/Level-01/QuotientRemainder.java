import java.util.Scanner;

public class QuotientRemainder {

    //  creating a Method to find the quotient and remainder of the division
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;  // Division for quotient
        int remainder = number % divisor; // Modulus for remainder

        // Returning the quotient and remainder in an array
        return new int[] { quotient, remainder };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //taking Input two numbers
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        System.out.println("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Checking if divisor is zero to avoid division by zero error
        if (divisor == 0) {
            System.out.println("Error: Divisor cannot be zero.");
        } else {
            // Getting the quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            // Displaying the quotient and remainder
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

           }
}