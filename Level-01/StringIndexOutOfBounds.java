import java.util.Scanner;

public class StringIndexOutOfBounds extends Throwable {
    public static void demonstrateStringIndexOutOfBounds(String str) {

        try {
            System.out.println("the charecter at the indef of 6 is: " + str.charAt(str.length()+1));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException accrued: cannot get the character beyond the length");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();
        StringIndexOutOfBounds.demonstrateStringIndexOutOfBounds(str);

    }
}
