import java.util.Random;

public class ZaraBonus {

    public static void main(String[] args) {
        int numEmployees = 10;
        int[][] employeeData = determineSalaryAndYearsOfService(numEmployees);

        int[][] updatedData = calculateNewSalaryAndBonus(employeeData);

        displayResults(updatedData);
    }

    public static int[][] determineSalaryAndYearsOfService(int numEmployees) {
        int[][] data = new int[numEmployees][3]; // 3 columns: employee ID, salary, years of service
        Random random = new Random();

        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = i + 1; // Employee ID
            data[i][1] = random.nextInt(90000) + 10000; // 5-digit salary
            data[i][2] = random.nextInt(10) + 1; // Years of service (1 to 10 years)
        }

        return data;
    }

    public static int[][] calculateNewSalaryAndBonus(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            int yearsOfService = data[i][2];
            int salary = data[i][1];
            int bonusPercentage = (yearsOfService > 5) ? 5 : 2; // Determine bonus percentage
            int bonusAmount = (salary * bonusPercentage) / 100;
            int newSalary = salary + bonusAmount;

            data[i][1] = newSalary; // Update salary in the array
            data[i][2] = bonusAmount; // Add bonus amount to the array
        }

        return data;
    }

    public static void displayResults(int[][] data) {
        System.out.println("Employee ID\tOld Salary\tNew Salary\tBonus Amount");
        System.out.println("--------------------------------------------------");

        int totalOldSalary = 0;
        int totalNewSalary = 0;
        int totalBonus = 0;

        for (int[] employee : data) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\n", employee[0], employee[1] - employee[2], employee[1], employee[2]);
            totalOldSalary += (employee[1] - employee[2]);
            totalNewSalary += employee[1];
            totalBonus += employee[2];
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus Amount: " + totalBonus);
    }
}