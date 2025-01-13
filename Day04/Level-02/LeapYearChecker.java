import java.util.Scanner;

public class LeapYearChecker {

    //Creating Method to check whether the year is a leap year
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false; 
        }
        
        //checking Leap year condition
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;  // Divisible by 400 is a leap year
            } else {
                return true;  // Divisible by 4 but not by 100 is a leap year
            }
        }
        
        return false; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking year as input
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Checking if the year is a leap year using the method
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}