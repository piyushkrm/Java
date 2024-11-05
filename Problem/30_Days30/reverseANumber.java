
// Reverse a number

public class reverseANumber {

    // Method to reverse a string
    public static int reverseNumber(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            int digit = number % 10;
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
