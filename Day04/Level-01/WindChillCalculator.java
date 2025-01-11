import java.util.Scanner;

public class WindChillCalculator {

    // creating Method to calculate the wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        // using Formula for wind chill
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creating instance of WindChillCalculator to use the calculateWindChill method
        WindChillCalculator calculator = new WindChillCalculator();

        //taking Input temperature and wind speed
        System.out.println("Enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();

        System.out.println("Enter the wind speed in miles per hour: ");
        double windSpeed = scanner.nextDouble();

        // Checking if wind speed is greater than or equal to 3 (valid wind speed)
        if (windSpeed < 3) {
            System.out.println("Wind speed must be at least 3 mph to calculate wind chill.");
        } else {
            // Calculating the wind chill
            double windChill = calculator.calculateWindChill(temperature, windSpeed);

            // Display the wind chill temperature
            System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);
        }


    }
}