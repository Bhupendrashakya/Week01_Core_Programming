import java.util.Scanner;

//Creating a Class BMICalculator to calculate BMI and display height, weight, BMI, and status
class BMICalculator 
{

    // Method to find BMI and status
    public static String[][] findBMIStatus(double[][] heightWeightArray) 
	{
        // Creating a 2D String array to store weight, height, BMI, and status for each person
        String[][] bmiStatusArray = new String[10][4];
        for (int i = 0; i < 10; i++) 
		{
            // Extracting weight and height (converted from cm to meters)
            double weight = heightWeightArray[i][0];
			
            double heightInMeters = heightWeightArray[i][1] / 100; // Convert height from cm to meters
			
            // Calculating BMI using the formula: weight / (height * height)
            double bmi = weight / (heightInMeters * heightInMeters);
			
            // Determining BMI status based on the BMI value
            String status = getStatus(bmi);
            // Storing weight, height, BMI, and status in the array
            bmiStatusArray[i][0] = String.format("%.2f", weight);
            bmiStatusArray[i][1] = String.format("%.2f", heightInMeters);
            bmiStatusArray[i][2] = String.format("%.2f", bmi);
            bmiStatusArray[i][3] = status;
        }
        // Returning the 2D String array with BMI and status information
        return bmiStatusArray;
    }

    // Method to determine BMI status based on the BMI value
    public static String getStatus(double bmi) 
	{
        // Returning the appropriate status based on BMI ranges
        if (bmi < 18.5) 
		{
            return "Underweight";
        } 
		else if (bmi >= 18.5 && bmi < 24.9) 
		{
            return "Normal weight";
        } 
		else if (bmi >= 25 && bmi < 29.9) 
		{
            return "Overweight";
        } 
		else 
		{
            return "Obesity";
        }
    }

    // Method to display the 2D String array in a tabular format
    public static void displayBMIStatus(String[][] bmiStatusArray) 
	{
        // Printing table headers
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(m)", "BMI", "Status");
        // Looping through the array to print each person's details
        for (int i = 0; i < 10; i++) 
		{
            System.out.printf("%-10s %-10s %-10s %-15s%n", bmiStatusArray[i][0], bmiStatusArray[i][1], bmiStatusArray[i][2], bmiStatusArray[i][3]);
        }
    }

    // Main method to run the program
    public static void main(String[] args) 
	{
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Creating a 2D array to store height and weight of 10 individuals
        double[][] heightWeightArray = new double[10][2];

        // Taking user inputs for weight and height
        for (int i = 0; i < 10; i++) 
		{
            // Prompting user to enter weight and storing it in the array
            System.out.println("Enter weight (in kg) of person " + (i + 1) + ":");
            heightWeightArray[i][0] = scanner.nextDouble();
			
            // Prompting user to enter height and storing it in the array
            System.out.println("Enter height (in cm) of person " + (i + 1) + ":");
            heightWeightArray[i][1] = scanner.nextDouble();
        }

        // Calling method to compute BMI and status
        String[][] bmiStatusArray = findBMIStatus(heightWeightArray);
        // Calling method to display the results
        displayBMIStatus(bmiStatusArray);
    }
}