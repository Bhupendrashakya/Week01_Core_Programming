import java.util.Scanner;

public class DuplicateString {
public static void RemoveDuplicate(String str){
    StringBuilder newstr = new StringBuilder();

    for (int i=0;i<str.length();i++){
        char currentChar=str.charAt(i);
        if (newstr.indexOf(String.valueOf(currentChar)) == -1) {
            // If not, append it to the new string
            newstr.append(currentChar);
        }
    }
    System.out.println("Yhe new string is "+newstr);
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String str= sc.next();
        RemoveDuplicate(str);
    }
}

