import java.util.Arrays;

public class OTPGenerator {

    public static void main(String[] args) {
        int[] otps = new int[10];

        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        boolean areUnique = checkUniqueOTPs(otps);

        if (areUnique) {
            System.out.println("All OTPs are unique.");
            System.out.println("Generated OTPs: " + Arrays.toString(otps));
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }

    public static int generateOTP() {
        int otp = (int) (Math.random() * 900000) + 100000; // Generating a 6-digit random number
        return otp;
    }

    public static boolean checkUniqueOTPs(int[] otps) {
        for (int i = 0; i < otps.length - 1; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate OTP found
                }
            }
        }
        return true; // All OTPs are unique
    }
}