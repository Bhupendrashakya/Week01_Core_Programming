import java.util.Scanner;

public class SumOfNaturalNumbersUsingRecursion {

    // creating Method to find the sum of n natural numbers using recursion
    public static int recursiveSum(int n) {
        if (n == 0) {
            return 0;  // sum of 0 natural numbers is 0
        } else {
            return n + recursiveSum(n - 1);  // Recursive call
        }
    }

    // creating Method to find the sum of n natural numbers using the formula n*(n+1)/2
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Checking if the number is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
            return;  // Exit if the number is not a valid natural number
        }

        // Finding the sum using recursion and formula
        int recursiveResult = recursiveSum(n);
        int formulaResult = formulaSum(n);

        // Displaying results
        System.out.println("Sum of first " + n + " natural numbers using recursion: " + recursiveResult);
        System.out.println("Sum of first " + n + " natural numbers using the formula n*(n+1)/2: " + formulaResult);

        // Comparing the two results
        if (recursiveResult == formulaResult) {
            System.out.println("The results are correct and match.");
        } else {
            System.out.println("The results do not match.");
        }
    }
}