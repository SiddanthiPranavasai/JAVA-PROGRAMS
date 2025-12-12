import java.util.Scanner;

public class sumofdigits {

    // Recursive function to find sum of digits
    static int sumDigits(int n) {
        if (n == 0) {
            return 0;  // base case
        }
        return (n % 10) + sumDigits(n / 10);  // recursive call
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = sumDigits(num);

        System.out.println("Sum of digits = " + result);

        sc.close();
    }
}
