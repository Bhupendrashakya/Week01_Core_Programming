import java.util.Scanner;

public class IllegalArgumentException extends Throwable {
  public static void GeneratingIllegalArgumentException(String str){
      System.out.println("printing the substring of "+str+str.substring(str.length()+1,str.length()));
  }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string ");
        String str=sc.next();
        try{

            GeneratingIllegalArgumentException(str);

        }catch (RuntimeException e){

            System.out.println("IllegalArgumentsException: Start Index cannot be greatedr than the end index ");
            System.out.println(e.getMessage());
        }
    }
}
