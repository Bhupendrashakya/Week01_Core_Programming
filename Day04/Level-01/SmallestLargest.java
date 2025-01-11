import java.util.Scanner;
class S {
    
    // creating Method to find the smallest and largest of the three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest, largest;
        
        // Initializing smallest and largest to the first number
        smallest = largest = number1;

        // Comparing and find the smallest
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        // Comparing and find the largest
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        // Returnning the smallest and largest in an array
        return new int[] { smallest, largest };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //taking Input 3 numbers
        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Getting the smallest and largest
        int[] result = findSmallestAndLargest(number1, number2, number3);
        
        // Display the results
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

      
    }
}