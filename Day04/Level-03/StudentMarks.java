import java.util.Random;
import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] studentScores = generateRandomScores(numStudents);
        int[][] studentResults = calculateResults(studentScores);

        displayScorecard(studentResults);
    }

    public static int[][] generateRandomScores(int numStudents) {
        int[][] scores = new int[numStudents][4]; // 4 columns: Physics, Chemistry, Math, Student ID
        Random random = new Random();

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(100); // Physics
            scores[i][1] = random.nextInt(100); // Chemistry
            scores[i][2] = random.nextInt(100); // Math
            scores[i][3] = i + 1; // Student ID
        }

        return scores;
    }

    public static int[][] calculateResults(int[][] scores) {
        int[][] results = new int[scores.length][6]; // 6 columns: Physics, Chemistry, Math, Total, Average, Percentage

        for (int i = 0; i < scores.length; i++) {
            results[i][0] = scores[i][0]; // Physics
            results[i][1] = scores[i][1]; // Chemistry
            results[i][2] = scores[i][2]; // Math
            results[i][3] = scores[i][0] + scores[i][1] + scores[i][2]; // Total
            results[i][4] = Math.round((float) results[i][3] / 3); // Average
            results[i][5] = Math.round((float) results[i][3] / 3); // Percentage
        }

        return results;
    }

    public static void displayScorecard(int[][] results) {
        System.out.println("Student ID\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade\tRemarks");
        System.out.println("----------------------------------------------------------------------------------------------------");

        for (int[] student : results) {
            String grade = getGrade(student[5]);
            String remarks = getRemarks(grade);

            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%s\t\t%s\n",
                    student[3], student[0], student[1], student[2], student[3], student[4], student[5], grade, remarks);
        }
    }

    public static String getGrade(int percentage) {
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "R";
        }
    }

    public static String getRemarks(String grade) {
        switch (grade) {
            case "A":
                return "(Level 4, above agency-normalized standards)";
            case "B":
                return "(Level 3, at agency-normalized standards)";
            case "C":
                return "(Level 2, below, but approaching agency-normalized standards)";
            case "D":
                return "(Level 1, well below agency-normalized standards)";
            case "E":
                return "(Level 1-, too below agency-normalized standards)";
            case "R":
                return "(Remedial standards)";
            default:
                return "";
        }
    }
}