import java.util.*;
public class FindLength{

    public static int Length(String str){
        int count=0;
        for(int i=0;;i++){
            try{
                char charecter= str.charAt(i);
                count++;

            }catch(RuntimeException e){

                
                break;
            }


        }

        return count;
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();
        System.out.println("The length of string "+str+" using user defined method  is "+Length(str));

        System.out.println("The length of string "+str+ " using built in method is "+str.length());
if(Length(str)==str.length()){
System.out.println("Both length are equal");
}
    }

}
