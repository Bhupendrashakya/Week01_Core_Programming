import java.util.Scanner;

public class VowelConsonentCount {
    public static void VowelConsonentCount(String str){
        int vowelcount=0;
        int consonentcount=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A'||str.charAt(i)=='a'){
                vowelcount++;
            }else if(str.charAt(i)=='E'||str.charAt(i)=='e'){
                vowelcount++;
            } else if (str.charAt(i)=='I'||str.charAt(i)=='i') {
               vowelcount++;
            } else if (str.charAt(i)=='O'||str.charAt(i)=='o') {
                vowelcount++;
            } else if (str.charAt(i)=='U'||str.charAt(i)=='u'){
                vowelcount++;
            }else{
                consonentcount++;
            }
        }
        System.out.println("The number of vowels in given string "+str+" is "+vowelcount);
        System.out.println("The number of consonant in given string "+str+" is "+consonentcount);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();
        VowelConsonentCount(str);
    }
}
