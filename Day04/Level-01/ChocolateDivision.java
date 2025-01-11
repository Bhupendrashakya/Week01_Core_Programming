import java.util.Scanner;

public class ChocolateDivision {

    //Creating Method to find the quotient and remainder of the division
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;  // Dividing for chocolates each child gets
        int remainder = number % divisor; // Modulus for remaining chocolates

        // Returning the quotient and remainder in an array
        return new int[] { quotient, remainder };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking Input number of chocolates and number of children
        System.out.println("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.println("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Checking if there are no children (to avoid division by zero)
        if (numberOfChildren == 0) {
            System.out.println("Error: The number of children cannot be zero.");
        } else {
            // Getting the quotient (chocolates per child) and remainder (remaining chocolates)
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Displaying the results
            System.out.println("Each child gets: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }

          }
}