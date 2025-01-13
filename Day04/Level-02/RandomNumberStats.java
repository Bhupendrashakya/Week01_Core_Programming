import java.util.Arrays;

public class RandomNumberStats {

    public static void main(String[] args) {
        int size = 5; // Generating five random numbers

        int[] randomNumbers = generate4DigitRandomArray(size);

        System.out.println("Generated random numbers: " + Arrays.toString(randomNumbers));

        double[] stats = findAverageMinMax(randomNumbers);

        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
    }

    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000; // Generating a random number between 1000 and 9999
        }

        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = sum / numbers.length;
        int min = Arrays.stream(numbers).min().getAsInt();

        int max = Arrays.stream(numbers).max().getAsInt();

        return new double[]{average, min, max};
    }
}