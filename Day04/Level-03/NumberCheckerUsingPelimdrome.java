import java.util.Arrays;

public class NumberCheckerUsingPelimdrome {

    public static void main(String[] args) {
        int number = 12321;

        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);

        int[] digits = storeDigits(number, digitCount);
        System.out.println("Digits: " + Arrays.toString(digits));

        int[] reversedDigits = reverseDigits(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversedDigits));

        boolean isPalindrome = isPalindrome(digits, reversedDigits);
        System.out.println("Is Palindrome: " + isPalindrome);

        boolean isDuckNumber = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuckNumber);
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

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean isPalindrome(int[] digits, int[] reversedDigits) {
        return Arrays.equals(digits, reversedDigits);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }
}