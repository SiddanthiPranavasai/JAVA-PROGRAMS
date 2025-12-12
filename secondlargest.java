public class secondlargest {
    public static void main(String[] args) {
        int num = 984539;

        int largest = -1;
        int secondLargest = -1;

        while (num > 0) {
            int digit = num % 10; 

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }

            num /= 10;
        }

        System.out.println("Second Largest Digit: " + secondLargest);
    }
}
