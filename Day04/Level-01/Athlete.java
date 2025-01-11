

import java.util.Scanner;

public class Athlete {
    public static int rounds(int kilometers,int pirameter){
        int rounds=kilometers/pirameter;
        return rounds;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first side of triangle in meters");
        int side1=sc.nextInt();
        System.out.println("enter second side of triangle in meters");
        int side2=sc.nextInt();
        System.out.println("enter third side of triangle in meters");
        int side3=sc.nextInt();
        int pirameter=side1+side2+side3;
        int kilometer=5000;
        System.out.println("The total rounds is"+Athlete.rounds(kilometer,pirameter));
    }
}
