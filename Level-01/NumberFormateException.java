import java.util.Scanner;

public class NumberFormateException extends Throwable {
    public static void generateNumberFormateException(String str){
        int number =Integer.parseInt(str);
        System.out.println("number is "+number);
    }
    public static void HandleNumberFormateException(String str){
        try {
           generateNumberFormateException(str);
        }catch (NumberFormatException e){
            System.out.println("Error: please enter a valid number");
        }catch (RuntimeException e){
            System.out.println("runtime error is acured "+e.getMessage());
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number (or a non-numeric value to trigger exception):");
        String userInput = sc.nextLine();
        try {
            generateNumberFormateException(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Caught in main: Error - " + e.getMessage());
        }
        HandleNumberFormateException(userInput);
    }
}
