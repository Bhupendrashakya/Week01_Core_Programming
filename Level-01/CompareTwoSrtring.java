import java.util.Scanner;

public class CompareTwoSrtring {
    public static void StringCeck(String string1,String string2){
        int flag =0;
        if(string1.length()!=string2.length()){
            System.out.println("Strings are not equal !");
        }else {
            for (int i = 0; i < string1.length(); i++) {
                if (string1.charAt(i) == string2.charAt(i)) {
                    flag=1 ;
                } else {
                    System.out.println("Strings are not equal !");
                    flag=0;
                }
            }
            if(flag==1){
                System.out.println("Strings are equal");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first string");
        String string1=sc.next();
        System.out.println("Enter second string");
        String string2=sc.next();
        CompareTwoSrtring.StringCeck(string1,string2);

    }
}
