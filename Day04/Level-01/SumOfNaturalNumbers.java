import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void Sum(int n){
                      

            // Calculating sum using the formula n*(n+1)/2
            int sumFormula = (n * (n + 1)) / 2;

            // Displaying the results and compare
            System.out.println("sum is "+sumFormula);
}
    public static void main(String[] args) {
        // Creating a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // msg the user to enter a number
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Checking if the entered number is a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        }
           SumOfNaturalNumbers.Sum(n);

          }
}