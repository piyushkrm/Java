
// Digits in a number

public class digitsInANumber {

    // Count of digits in a number
    public static int countOfDigits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    // Print the digits of the number
    public static void printDigits(int n) {
        System.out.print("Digits of " + n + " are: ");
        while (n != 0) {
            int digit = n % 10;
            System.out.print(digit + " ");
            n = n / 10;
        }
    }

    // Sum of the digits
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n!= 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 123456;
        System.out.println("Number of digits in " + number + " is: " + countOfDigits(number));
        printDigits(number);
        System.out.println("\nSum of digits in " + number + " is: " + sumOfDigits(number));
    }
}
