
// 7. Reverse Integer
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

public class reverseANumber {

    // Method to reverse a number
    public static int reverseNumber(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            int digit = number % 10;

            // Check for overflow/underflow
            if (reverseNumber > Integer.MAX_VALUE / 10 || reverseNumber < Integer.MIN_VALUE / 10) {
                return 0; // Return 0 if overflow/underflow occurs
            }

            reverseNumber = reverseNumber * 10 + digit;
            number = number / 10;
        }
        return reverseNumber;
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Original number: " + number);
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
