import java.util.*;

public class otp {

   
    static void printDigits(String otp, int index) {

        3
        if (index == otp.length()) {
            return;
        }

        System.out.println("Digit " + (index + 1) + " is " + otp.charAt(index));

        printDigits(otp, index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your OTP: ");
        String otp = sc.next();

        System.out.println("Your OTP is: " + otp);

        printDigits(otp, 0);

        sc.close();
    }
}
