import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparision {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first  date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        System.out.println("Enter a second  date (yyyy-MM-dd): ");
        String inputDate2 = scanner.nextLine();
        // Defining the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate firstdate= LocalDate.parse(inputDate,formatter);
        LocalDate seconddate= LocalDate.parse(inputDate2,formatter);
        if (firstdate.isBefore(seconddate)){
            System.out.println("First date is before of second date:");
        } else if (firstdate.isAfter(seconddate)) {
            System.out.println("first date is after second date :  ");
        } else if (firstdate.isEqual(seconddate)) {
            System.out.println("Both date are equal :");
        }

    }
}
