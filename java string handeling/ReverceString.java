import java.util.Scanner;

public class ReverceString {
    public static void RevarceString(String str){
        StringBuilder revercestr=new StringBuilder();
        for (int i=str.length()-1;i>=0;i--){
            revercestr=revercestr.append(str.charAt(i));
        }
        System.out.println("Reverce of the string "+str+" is "+revercestr);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();
        RevarceString(str);
    }
}
