public class NumberCheckerFOrPrime {

    public static void main(String[] args) {
        int number = 7;

        boolean isPrime = isPrime(number);
        System.out.println("Is Prime: " + isPrime);

        boolean isNeon = isNeon(number);
        System.out.println("Is Neon: " + isNeon);

        boolean isSpy = isSpy(number);
        System.out.println("Is Spy: " + isSpy);

        boolean isAutomorphic = isAutomorphic(number);
        System.out.println("Is Automorphic: " + isAutomorphic);

        boolean isBuzz = isBuzz(number);
        System.out.println("Is Buzz: " + isBuzz);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = sumOfDigits(square);
        return sumOfDigits == number;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static boolean isSpy(int number) {
        int sumOfDigits = sumOfDigits(number);
        int productOfDigits = productOfDigits(number);
        return sumOfDigits == productOfDigits;
    }

    public static int productOfDigits(int number) {
        int product = 1;
        while (number > 0) {
            product *= number % 10;
            number /= 10;
        }
        return product;
    }

    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int lastDigit = number % 10;
        return square % 10 == lastDigit;
    }

    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
}