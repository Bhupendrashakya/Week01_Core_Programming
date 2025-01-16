import java.util.Scanner;

// Creating a Class DeckOfCards to handle deck creation, shuffling, and distribution
public class DeckOfCards 
{

    // Method to initialize the deck of cards with suits and ranks
    public static String[] initializeDeck() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        // Initialize the deck with suits and ranks
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        return deck; // Return the initialized deck
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;

        // Iterate over the deck and swap each card with a random card from the remaining deck
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck; // Return the shuffled deck
    }

    // Method to distribute the deck of n cards to x number of players
    public static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers) {
        // Check if the number of cards can be distributed to the number of players
        if (numOfCards < numOfPlayers) {
            throw new IllegalArgumentException("Number of cards should be greater than or equal to number of players.");
        }

        // Create a 2D array to store the players and their cards
        String[][] playersCards = new String[numOfPlayers][numOfCards / numOfPlayers];
        int cardIndex = 0;

        // Distribute the cards to the players
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < (numOfCards / numOfPlayers); j++) {
                playersCards[i][j] = deck[cardIndex];
                cardIndex++;
            }
        }
        return playersCards; // Return the players and their cards
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (int j = 0; j < playersCards[i].length; j++) {
                System.out.println(playersCards[i][j]);
            }
            System.out.println();
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of cards and players
        System.out.print("Enter the number of cards to be dealt: ");
        int numOfCards = scanner.nextInt();
        System.out.print("Enter the number of players: ");
        int numOfPlayers = scanner.nextInt();

        // Initialize the deck
        String[] deck = initializeDeck();
        
        // Shuffle the deck
        String[] shuffledDeck = shuffleDeck(deck);

        // Distribute the cards to the players
        String[][] playersCards = distributeCards(shuffledDeck, numOfCards, numOfPlayers);

        // Print the players and their cards
        printPlayersCards(playersCards);
    }
}