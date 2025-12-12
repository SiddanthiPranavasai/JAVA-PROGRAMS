
import java.util.*;
public class recursionfactorial {
        public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        n = sc.nextInt();

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;   // correct multiplication
        }

        System.out.println("Factorial is: " + fact);
    }
}



