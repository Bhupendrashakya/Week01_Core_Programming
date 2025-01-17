import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateArithmetic {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Prompting user for a date input in the format yyyy-MM-dd
            System.out.println("Enter a date (yyyy-MM-dd): ");
            String inputDate = scanner.nextLine();

            // Defining the date format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            // Converting input string to LocalDate
            LocalDate date = LocalDate.parse(inputDate, formatter);

            // Performing date arithmetic: add 7 days, 1 month, and 2 years, then subtract 3 weeks
            LocalDate resultDate = date.plusDays(7);
                    date.plusMonths(1) ;
                    date.plusYears(2) ;
                   date.minusWeeks(3);
            // Output the result
            System.out.println("Original Date: " + date);
            System.out.println("  adding 7 days, 1 month, and 2 years, then subtracting 3 weeks: " + resultDate);

        }
    }


