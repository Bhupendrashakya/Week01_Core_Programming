import java.util.Scanner;

public class YoungestTallestFriends {

    //creating Method to find the youngest friend
    public static String findYoungest(int[] ages) {
        int youngestAge = ages[0];
        int youngestIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestIndex = i;
            }
        }

        // Returning the name of the youngest friend based on the index
        if (youngestIndex == 0) {
            return "Amar";
        } else if (youngestIndex == 1) {
            return "Akbar";
        } else {
            return "Anthony";
        }
    }

    //creating  Method to find the tallest friend
    public static String findTallest(double[] heights) {
        double tallestHeight = heights[0];
        int tallestIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestIndex = i;
            }
        }

        // Returning the name of the tallest friend based on the index
        if (tallestIndex == 0) {
            return "Amar";
        } else if (tallestIndex == 1) {
            return "Akbar";
        } else {
            return "Anthony";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating arrays to store the ages and heights of the friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Getting user input for the ages and heights of the friends
        System.out.print("Enter the age of Amar: ");
        ages[0] = scanner.nextInt();
        System.out.print("Enter the height of Amar (in meters): ");
        heights[0] = scanner.nextDouble();

        System.out.print("Enter the age of Akbar: ");
        ages[1] = scanner.nextInt();
        System.out.print("Enter the height of Akbar (in meters): ");
        heights[1] = scanner.nextDouble();

        System.out.print("Enter the age of Anthony: ");
        ages[2] = scanner.nextInt();
        System.out.print("Enter the height of Anthony (in meters): ");
        heights[2] = scanner.nextDouble();

        // Finding the youngest and tallest friends
        String youngest = findYoungest(ages);
        String tallest = findTallest(heights);

        // Displaying the results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

          }
}