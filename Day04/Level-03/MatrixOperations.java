
import java.util.Random;

public class MatrixOperations {

    // Method to generate a random matrix with given rows and columns
    public static double[][] generateMatrix(int rows, int cols) {
        // Create a 2D array to store matrix elements
        double[][] matrix = new double[rows][cols];
        Random random = new Random();

        // Fill the matrix with random numbers between 1 and 10
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = 1 + random.nextInt(10);
            }
        }

        // Return the generated matrix
        return matrix;
    }

    // Method to add two matrices
    public static double[][] addMatrices(double[][] matrix1, double[][] matrix2) {
        // Create a 2D array to store the result of addition
        double[][] result = new double[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Return the resulting matrix
        return result;
    }

    // Method to subtract two matrices
    public static double[][] subtractMatrices(double[][] matrix1, double[][] matrix2) {
        // Create a 2D array to store the result of subtraction
        double[][] result = new double[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // Return the resulting matrix
        return result;
    }

    // Method to multiply two matrices
    public static double[][] multiplyMatrices(double[][] matrix1, double[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int common = matrix1[0].length;
        // Create a 2D array to store the result of multiplication
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Return the resulting matrix
        return result;
    }

    // Method to find the transpose of a matrix
    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        // Create a 2D array to store the transposed matrix
        double[][] transposed = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        // Return the transposed matrix
        return transposed;
    }

    // Method to find the determinant of a 2x2 matrix
    public static double determinant2x2(double[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    // Method to find the determinant of a 3x3 matrix
    public static double determinant3x3(double[][] matrix) {
        return matrix[0][0] * ((matrix[1][1] * matrix[2][2]) - (matrix[1][2] * matrix[2][1]))
                - matrix[0][1] * ((matrix[1][0] * matrix[2][2]) - (matrix[1][2] * matrix[2][0]))
                + matrix[0][2] * ((matrix[1][0] * matrix[2][1]) - (matrix[1][1] * matrix[2][0]));
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(double[][] matrix) {
        double determinant = determinant2x2(matrix);
        if (determinant == 0) {
            throw new IllegalArgumentException("Matrix is singular, cannot find inverse.");
        }

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / determinant;
        inverse[0][1] = -matrix[0][1] / determinant;
        inverse[1][0] = -matrix[1][0] / determinant;
        inverse[1][1] = matrix[0][0] / determinant;

        // Return the inverse matrix
        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.printf("%.2f\t", element);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Generate two random 3x3 matrices
        double[][] matrix1 = generateMatrix(3, 3);
        double[][] matrix2 = generateMatrix(3, 3);

        // Display the generated matrices
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        // Perform and display the results of matrix operations
        System.out.println("Matrix Addition:");
        displayMatrix(addMatrices(matrix1, matrix2));

        System.out.println("Matrix Subtraction:");
        displayMatrix(subtractMatrices(matrix1, matrix2));

        System.out.println("Matrix Multiplication:");
        displayMatrix(multiplyMatrices(matrix1, matrix2));

        System.out.println("Transpose of Matrix 1:");
        displayMatrix(transposeMatrix(matrix1));

        System.out.println("Determinant of Matrix 1: " + determinant3x3(matrix1));

        
            System.out.println("Inverse of a 2x2 Matrix (Extracted from Matrix 1):");
            double[][] matrix2x2 = { { matrix1[0][0], matrix1[0][1] }, { matrix1[1][0], matrix1[1][1] } };
            displayMatrix(inverse2x2(matrix2x2));
       
    }
}