import java.util.Scanner; // Import the Scanner class for user input

// Creating Trigonometric class to calculate trigonometric functions
class Trigonometric {

    // Creating calculateTrigonometricFunctions method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) 
	{
        // Converting the angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Creating an array to store the results of the trigonometric functions
        double[] results = new double[3];

        // Calculating sine, cosine, and tangent of the angle
        results[0] = Math.sin(radians);    // Sine of the angle
        results[1] = Math.cos(radians);    // Cosine of the angle
        results[2] = Math.tan(radians);    // Tangent of the angle

        // Returning the results array
        return results;
    }

    // Creating main method to take user input and display the trigonometric functions
    public static void main(String[] args) 
	{
        // Creating Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompting user to enter the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        // Create a double variable angle to hold the user input
        double angle = scanner.nextDouble();

        // Calculating the trigonometric functions using the calculateTrigonometricFunctions method
        double[] results = calculateTrigonometricFunctions(angle);

        // Printing the results of the trigonometric functions
        System.out.printf("Sine of %.2f degrees is %.4f%n", angle, results[0]);
        System.out.printf("Cosine of %.2f degrees is %.4f%n", angle, results[1]);
        System.out.printf("Tangent of %.2f degrees is %.4f%n", angle, results[2]);

           }
}