

import java.util.Scanner;

public class Simpleintrest {
// creating a method to calculate simple intrest
    public  static double simpleIntrest(double amount,int rate, int time) {
        double intrest=(amount*rate*time)/100;
        return intrest;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
// taking input from the user
        System.out.println("Enter pricipal amount:");
        double amount=sc.nextDouble();
        System.out.println("Enter rate:");
        int rate=sc.nextInt();
        System.out.println("Enter time");
        int time=sc.nextInt();
//printing the simple intrest
        System.out.println("Simple intrest is: "+Simpleintrest.simpleIntrest(amount,rate,time));
       
    }
}
