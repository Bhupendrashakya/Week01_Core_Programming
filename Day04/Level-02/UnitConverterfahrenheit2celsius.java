public class UnitConverterfahrenheit2celsius  {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;  // Conversion formula for Fahrenheit to Celsius
        return fahrenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;  // Conversion formula for Celsius to Fahrenheit
        return celsius2fahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;  // Conversion factor for pounds to kilograms
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;  // Conversion factor for kilograms to pounds
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;  // Conversion factor for gallons to liters
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;  // Conversion factor for liters to gallons
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        // Test the UnitConverter methods

        // Convert Fahrenheit to Celsius
        double fahrenheit = 98.6;
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");

        // Convert Celsius to Fahrenheit
        double celsiusInput = 37;
        double fahrenheitOutput = convertCelsiusToFahrenheit(celsiusInput);
        System.out.println(celsiusInput + " Celsius is equal to " + fahrenheitOutput + " Fahrenheit.");

        // Convert pounds to kilograms
        double pounds = 150;
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");

        // Convert kilograms to pounds
        double kilogramsInput = 68;
        double poundsOutput = convertKilogramsToPounds(kilogramsInput);
        System.out.println(kilogramsInput + " kilograms is equal to " + poundsOutput + " pounds.");

        // Convert gallons to liters
        double gallons = 5;
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + liters + " liters.");

        // Convert liters to gallons
        double litersInput = 10;
        double gallonsOutput = convertLitersToGallons(litersInput);
        System.out.println(litersInput + " liters is equal to " + gallonsOutput + " gallons.");
    }
}
