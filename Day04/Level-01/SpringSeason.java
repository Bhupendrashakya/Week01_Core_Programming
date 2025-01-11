public class SpringSeason {
      
       public static void SeasonCheck(int month, int day){
       // Check if the month and day fall within the Spring Season (March 20 to June 20)
        if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
}

    public static void main(String[] args) {
        // Ensure that the user has provided two arguments for month and day
        if (args.length != 2) {
            System.out.println("Please provide two arguments: month and day.");
            return;
        }
        
        // taking the command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

       SpringSeason.SeasonCheck(month,day);
    }
}