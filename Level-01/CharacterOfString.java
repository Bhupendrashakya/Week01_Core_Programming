import java.sql.SQLOutput;
import java.util.Scanner;

public class CharacterOfString {
    public static char[] GetCharecters(String string){
        char charecter[]=new char[string.length()];
        for (int i=0;i<string.length();i++){
            charecter[i]=string.charAt(i);
        }
     return charecter;
    }
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER TEXT: ");
        String string=sc.next();
        char[] userDefinedCharArray = CharacterOfString.GetCharecters(string);

        // Get the character array using the built-in toCharArray() method
        char[] builtInCharArray = string.toCharArray();

        // Compare the two char arrays and display the result
        boolean areArraysEqual = compareCharArrays(userDefinedCharArray, builtInCharArray);

        if (areArraysEqual) {
            System.out.println("Both char arrays are equal.");
        } else {
            System.out.println("Both char arrays are NOT equal.");
        }
    }
}
