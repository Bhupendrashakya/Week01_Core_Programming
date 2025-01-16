import java.util.Random; // Importing the Random class to generate random scores
import java.util.Scanner; // Importing the Scanner class to read user input

// Creating the class StudentScoreCard to manage student scores and calculate grades
public class StudentScoreCard
 {

    // Creating the method generateScores to generate random 2-digit scores for Physics, Chemistry, and Maths (PCM)
    public static int[][] generateScores(int numberOfStudents) 
	{
        // Creating a 2D array to store the scores of the students
        int[][] scores = new int[numberOfStudents][3];
        // Creating a Random object to generate random scores
        Random random = new Random();

        // Generating random 2-digit scores for the students in PCM
        for (int i = 0; i < numberOfStudents; i++) 
		{
            scores[i][0] = random.nextInt(90) + 10; // Physics score
            scores[i][1] = random.nextInt(90) + 10; // Chemistry score
            scores[i][2] = random.nextInt(90) + 10; // Maths score
        }

        // Returning the 2D array of scores
        return scores;
    }

    // Creating the method calculateResults to calculate the total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        // Creating a 2D array to store the results of the students
        double[][] results = new double[scores.length][3];

        // Iterating through the scores to calculate total, average, and percentage
        for (int i = 0; i < scores.length; i++) {
            // Calculating the total score
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            // Calculating the average score
            double average = total / 3.0;
            // Calculating the percentage
            double percentage = (total / 300.0) * 100;

            // Storing the results
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        // Returning the 2D array of results
        return results;
    }

    // Creating the method calculateGrades to calculate the grade based on the percentage
    public static String[][] calculateGrades(double[][] results) {
        // Creating a 2D array to store the grades of the students
        String[][] grades = new String[results.length][2];

        // Iterating through the results to calculate grades
        for (int i = 0; i < results.length; i++) 
		{
            // Storing the percentage as a String
            grades[i][0] = String.valueOf(results[i][2]);

            // Calculating the grade based on the percentage
            if (results[i][2] >= 80) 
			{
                grades[i][1] = "A";
            } 
			else if (results[i][2] >= 70) 
			{
                grades[i][1] = "B";
            } 
			else if (results[i][2] >= 60) 
			{
                grades[i][1] = "C";
            } 
			else if (results[i][2] >= 50) 
			{
                grades[i][1] = "D";
            } 
			else if (results[i][2] >= 40) 
			{
                grades[i][1] = "E";
            } 
			else 
			{
                grades[i][1] = "R";
            }
        }

        // Returning the 2D array of grades
        return grades;
    }

    // Creating the method displayScoreCard to display the scorecard of all students in a tabular format
    public static void displayScoreCard(int[][] scores, double[][] results, String[][] grades) 
	{
        // Displaying the table headers
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");

        // Iterating through the data and displaying each student's scorecard
        for (int i = 0; i < scores.length; i++) 
		{
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t" +
                (int) results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\t\t" + grades[i][1]);
        }
    }

    public static void main(String[] args) 
	{
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Defining the number of students
        int numberOfStudents = 10;

        // Generating random scores for the students
        int[][] scores = generateScores(numberOfStudents);

        // Calculating the results of the students
        double[][] results = calculateResults(scores);

        // Calculating the grades of the students
        String[][] grades = calculateGrades(results);

        // Displaying the scorecard of all students in a tabular format
        displayScoreCard(scores, results, grades);

        // Closing the Scanner object to free up resources
        scanner.close();
    }
}