public class UnitConverter {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double kmToMiles = 0.621371;  // Conversion factor for km to miles
        return km * kmToMiles ;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;  // Conversion factor for miles to km
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;  // Conversion factor for meters to feet
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;  // Conversion factor for feet to meters
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        // Test the UnitConverter methods

        // Convert kilometers to miles
        double km = 10;
        double miles = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + miles + " miles.");

        // Convert miles to kilometers
        double milesInput = 6.21;
        double kmOutput = convertMilesToKm(milesInput);
        System.out.println(milesInput + " miles is equal to " + kmOutput + " kilometers.");

        // Convert meters to feet
        double meters = 5;
        double feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feet + " feet.");

        // Convert feet to meters
        double feetInput = 16.4;
        double metersOutput = convertFeetToMeters(feetInput);
        System.out.println(feetInput + " feet is equal to " + metersOutput + " meters.");
    }
}