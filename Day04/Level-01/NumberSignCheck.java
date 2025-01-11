import java.util.Scanner;

public class NumberSignCheck {
       public static void NumberCheck(int number){
             // Checking the sign of the number
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }       
}
    public static void main(String[] args) {
        // Creating Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        NumberSignCheck.NumberCheck(number);
        
          }
}