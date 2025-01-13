import java.util.Arrays;

public class NumberCheckerUsingMathPow {

    public static void main(String[] args) {
        int number = 12345;

        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);

        int[] digits = storeDigits(number, digitCount);
        System.out.println("Digits: " + Arrays.toString(digits));

        int sumOfDigits = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sumOfDigits);

        int sumOfSquares = sumOfSquares(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        boolean isHarshad = isHarshadNumber(number, sumOfDigits);
        System.out.println("Is Harshad number: " + isHarshad);

        int[][] digitFrequencies = findDigitFrequencies(digits);
        System.out.println("Digit Frequencies:");
        for (int[] row : digitFrequencies) {
            System.out.println(row[0] + ": " + row[1]);
        }
    }

    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] storeDigits(int number, int digitCount) {
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number, int sumOfDigits) {
        return number % sumOfDigits == 0;
    }

    public static int[][] findDigitFrequencies(int[] digits) {
        int[][] frequencies = new int[10][2]; // 10 digits (0-9)

        for (int i = 0; i < 10; i++) {
            frequencies[i][0] = i; // Digit
            frequencies[i][1] = 0; // Frequency
        }

        for (int digit : digits) {
            frequencies[digit][1]++;
        }

        return frequencies;
    }
}