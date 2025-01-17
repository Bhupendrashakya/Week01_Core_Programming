import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    // Function to generate a random guess within the current range
    public static int generateGuess(int lowerBound, int upperBound) {
        Random random = new Random();
        return lowerBound + random.nextInt(upperBound - lowerBound + 1);
    }

    // Function to get user feedback
    public static String getUserFeedback() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is the guess correct, too high, or too low? (Enter 'correct', 'high', or 'low'): ");
        return scanner.nextLine().toLowerCase();
    }

    // Main game logic function
    public static void playGame() {
        int lowerBound = 1;
        int upperBound = 100;
        int guess;
        String feedback;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Think of a number between 1 and 100, and I'll try to guess it.");

        // Repeat until the correct guess is made
        do {
            guess = generateGuess(lowerBound, upperBound);  // Generate a guess
            System.out.println("Is the number " + guess + "?");

            feedback = getUserFeedback();  // Get user feedback

            if (feedback.equals("high")) {
                upperBound = guess - 1;  // If the guess is too high, adjust the upper bound
            } else if (feedback.equals("low")) {
                lowerBound = guess + 1;  // If the guess is too low, adjust the lower bound
            } else if (!feedback.equals("correct")) {
                // Handle invalid feedback
                System.out.println("Invalid input. Please enter 'correct', 'high', or 'low'.");
            }

        } while (!feedback.equals("correct"));

        System.out.println("Yay! I guessed your number correctly!");
    }

    public static void main(String[] args) {
        playGame();  // Start the game
    }
}
