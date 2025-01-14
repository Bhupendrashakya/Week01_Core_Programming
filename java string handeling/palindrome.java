import java.util.Scanner;

public class palindrome {
    public static boolean IsPelindrome(String str){
        int temp=str.length()-1;
        boolean flag=false;
        for (int i=0;i<temp;i++){
            if(str.charAt(i)==str.charAt(temp)){
                flag=true;
                temp--;
            }else{
                flag=false;
                temp--;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();
        System.out.println("Is the string "+str+" is pelindrome "+ IsPelindrome(str));
    }
}
