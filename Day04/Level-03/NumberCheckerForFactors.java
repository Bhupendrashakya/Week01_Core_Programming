import java.util.ArrayList;

public class NumberCheckerForFactors {

    // creating Method to find the factors of a number and return them as an array
    public static int[] findFactors(int number) {
        ArrayList<Integer> factorsList = new ArrayList<>();
        
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factorsList.add(i); // Add the factor to the list
            }
        }
        
        // Convert ArrayList to array
        int[] factors = new int[factorsList.size()];
        for (int i = 0; i < factorsList.size(); i++) {
            factors[i] = factorsList.get(i);
        }
        
        return factors;
    }

    //creating Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int[] factors) {
        int greatest = factors[0];
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    //creating Method to find the sum of the factors using the factors array
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    //creating Method to find the product of the factors using the factors array
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    //creating Method to find the product of cubes of the factors using the factors array
    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3); // Cube each factor
        }
        return product;
    }

    //creating Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum == number;
    }

    //creating Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum > number;
    }

    // creating Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum < number;
    }

    //creating Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit); // Add the factorial of each digit
            number /= 10;
        }
        
        return sum == originalNumber;
    }

    //  method to calculate the factorial of a number
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = 145;  // Example number for testing

        // Finding the factors of the number
        int[] factors = findFactors(number);

        // Displaying the factors
        System.out.println("Factors of " + number + ":");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Finding the greatest factor
        int greatest = greatestFactor(factors);
        System.out.println("Greatest factor: " + greatest);

        // Finding the sum of the factors
        int sum = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sum);

        // Finding the product of the factors
        int product = productOfFactors(factors);
        System.out.println("Product of factors: " + product);

        // Finding the product of the cubes of the factors
        double productOfCubes = productOfCubesOfFactors(factors);
        System.out.println("Product of cubes of factors: " + productOfCubes);

        // Checking if the number is a perfect number
        boolean isPerfect = isPerfectNumber(number);
        System.out.println("Is the number a perfect number? " + (isPerfect ? "Yes" : "No"));

        // Checking if the number is an abundant number
        boolean isAbundant = isAbundantNumber(number);
        System.out.println("Is the number an abundant number? " + (isAbundant ? "Yes" : "No"));

        // Checking if the number is a deficient number
        boolean isDeficient = isDeficientNumber(number);
        System.out.println("Is the number a deficient number? " + (isDeficient ? "Yes" : "No"));

        // Checking if the number is a strong number
        boolean isStrong = isStrongNumber(number);
        System.out.println("Is the number a strong number? " + (isStrong ? "Yes" : "No"));
    }
}