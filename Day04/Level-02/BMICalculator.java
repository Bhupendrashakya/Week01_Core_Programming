import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3]; // creating 2D array to store weight, height, and BMI

        // taking Input weight and height for each member
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for member " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm) for member " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();

            // Calculating BMI
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
        }

        // Determining BMI status for each member
        String[] status = determineBMIStatus(data);

        // Displaying results
        System.out.println("\nMember\tHeight (cm)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n", i + 1, data[i][1], data[i][0], data[i][2], status[i]);
        }
    }

    // Calculating BMI
    public static double calculateBMI(double weight, double height) {
        // Converting height from cm to meters
        double heightInMeters = height / 100;
        return weight / (heightInMeters * heightInMeters);
    }

    // Determining BMI status
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[10];
        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
}