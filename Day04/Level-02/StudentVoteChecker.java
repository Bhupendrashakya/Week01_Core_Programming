import java.util.Scanner;

public class StudentVoteChecker {

    //  creating Method to check whether a student can vote
    public boolean canStudentVote(int age) {
        // Validate the age
        if (age < 0) {
            return false;  // Invalid age cannot vote
        }
        
        // Checking if age is 18 or above
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an array to store the ages of 10 students
        int[] ages = new int[10];
        
        // Creating an instance of StudentVoteChecker to call the canStudentVote method
        StudentVoteChecker checker = new StudentVoteChecker();
        
        // Loop through the array to get the ages of 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();  // Get age from user input
            
            // Checking if the student can vote
            if (checker.canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
        
           }
}