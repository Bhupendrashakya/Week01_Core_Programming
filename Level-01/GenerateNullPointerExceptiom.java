public class GenerateNullPointerExceptiom {


        // Method to generate a NullPointerException
        public static void generateNullPointerException() {
            // Define a String variable and initialize it to null
            String text = null;

            // Attempt to call a method on the null reference, which will generate a NullPointerException
            System.out.println("Length of the string: " + text.length());
        }

        // Method to demonstrate NullPointerException handling
        public static void handleNullPointerException() {
            // Define a String variable and initialize it to null
            String text = null;

            try {
                // Attempt to call a method on the null reference
                System.out.println("Length of the string: " + text.length());
            } catch (NullPointerException e) {
                // Handle the NullPointerException
                System.out.println("NullPointerException caught: Cannot call methods on a null reference.");
            }
        }

        public static void main(String[] args) {
            // First, call the method to generate the NullPointerException
            System.out.println("Generating NullPointerException...");
            try {
                generateNullPointerException();
            } catch (NullPointerException e) {
                System.out.println("Caught exception in main: " + e);
            }

            // Now, call the method to handle the NullPointerException
            System.out.println("\nDemonstrating NullPointerException handling...");
            handleNullPointerException();
        }
    }


