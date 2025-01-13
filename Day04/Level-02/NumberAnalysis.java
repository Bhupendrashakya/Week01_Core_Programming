import java.util.Scanner;

public class NumberAnalysis {

    // creating Method to check whether the number is positive or negative
    public static String isPositive(int number) {
        if (number >= 0) {
            return "positive";
        } else {
            return "negative";
        }
    }

    //creating Method to check whether the number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    //creating Method to compare two numbers and return 1 if number1 > number2, 0 if equal, or -1 if number1 < number2
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;  // number1 is greater than number2
        } else if (number1 == number2) {
            return 0;  // both numbers are equal
        } else {
            return -1;  // number1 is less than number2
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // creating Array to store 5 numbers
        int[] numbers = new int[5];

        // Taking user input for the 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array to check whether the number is positive/negative, and if positive, whether it's even/odd
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            System.out.print("Number " + (i + 1) + " (" + num + ") is ");

            // Checking if number is positive or negative
            String positivity = isPositive(num);
            System.out.print(positivity);

            // If the number is positive, check if it's even or odd
            if (positivity.equals("positive")) {
                String evenOrOdd = isEven(num);
                System.out.println(" and " + evenOrOdd + ".");
            } else {
                System.out.println(".");
            }
        }

        // Comparing the first and last element of the array
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        int comparisonResult = compare(first, last);

        // Displaying the comparison result
        if (comparisonResult == 1) {
            System.out.println("The first number (" + first + ") is greater than the last number (" + last + ").");
        } else if (comparisonResult == 0) {
            System.out.println("The first number (" + first + ") is equal to the last number (" + last + ").");
        } else {
            System.out.println("The first number (" + first + ") is less than the last number (" + last + ").");
        }

          }
}