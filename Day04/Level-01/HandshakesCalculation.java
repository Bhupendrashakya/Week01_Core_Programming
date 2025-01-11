

import java.util.Scanner;

public class HandshakesCalculation {
    // creating a method to calculate the numbers of handshakes
    public  static int handshakes(int students) {
        int handshakes= (students * (students - 1)) / 2;
        return handshakes;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numbers of students:");
        // taking input for number of students
        int students=sc.nextInt();
        // calling the method and displaying the result
        System.out.println("The number of handshakes is: "+HandshakesCalculation.handshakes(students));

    }
}
