import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class DateFoematting {
    public static void main(String[] args) {
        //ZonedDateTime istTime = ZonedDateTime.now();
        LocalDate date= LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter2= DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        String newDate1=date.format(formatter);
        String newDate2=date.format(formatter1);
        String newDate3=date.format(formatter2);
        System.out.println(newDate1);
        System.out.println(newDate2);
        System.out.println(newDate3);
        //System.out.println(date.plusDays(5).format(formatter));
    }

}
