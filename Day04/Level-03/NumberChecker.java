import java.util.Arrays;

public class NumberChecker {

    //creating Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();  // Converting number to string and count the length
    }

    // creating Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;  // Extracting the last digit and store it
            number /= 10;  // Removing the last digit
        }

        return digits;
    }

    //creating Method to check if a number is a Duck number
    public static boolean isDuckNumber(int[] digits) {
        // A Duck number cannot start with 0, so check for non-zero digit in the number
        for (int digit : digits) {
            if (digit != 0) {
                return true;  // Duck number has a non-zero digit
            }
        }
        return false;
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int[] digits, int originalNumber) {
        int numberOfDigits = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, numberOfDigits);  // Sum of digits raised to the power of number of digits
        }
        return sum == originalNumber;  // Armstrong number condition
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return new int[] { largest, secondLargest };
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return new int[] { smallest, secondSmallest };
    }

    public static void main(String[] args) {
        int number = 153;  // Example number

        // Step 1: Store the digits of the number in an array
        int[] digits = storeDigits(number);

        // Step 2: Check if it's a Duck number
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is the number a Duck Number? " + (isDuck ? "Yes" : "No"));

        // Step 3: Check if it's an Armstrong number
        boolean isArmstrong = isArmstrongNumber(digits, number);
        System.out.println("Is the number an Armstrong Number? " + (isArmstrong ? "Yes" : "No"));

        // Step 4: Find the count of digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        // Step 5: Find largest and second largest digits
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestAndSecondLargest[0]);
        System.out.println("Second largest digit: " + largestAndSecondLargest[1]);

        // Step 6: Find smallest and second smallest digits
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestAndSecondSmallest[0]);
        System.out.println("Second smallest digit: " + smallestAndSecondSmallest[1]);
    }
}