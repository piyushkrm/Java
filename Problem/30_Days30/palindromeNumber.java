
// Checking Palindrome number 

public class palindromeNumber {

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

    public static boolean isPalindrome(int value) {
        if (value < 0)
            return false;
        int reverseNumber = reverseNumber(value);
        return value == reverseNumber;
    }

    public static void main(String[] args) {
        int number = 12321;
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number");
        } else {
            System.out.println(number + " is not a palindrome number");
        }
    }
}
