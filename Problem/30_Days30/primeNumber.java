// Prime number problem

public class primeNumber {

    // Check if number is prime or not
    public static String isPrime(int x) {
        if (x <= 1) {
            return "Not a prime number";
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return "Not a prime number";
            }
        }
        return "Prime number";
    }

    // Check numbers are prime numbers in a range
    public static void checkPrimeInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i + " : " + isPrime(i));
        }
    }

    public static void main(String[] args) {
        int number = 24;
        System.out.println(isPrime(number)); // Output: Not a prime number
        
        int start = 1;
        int end = 20;
        checkPrimeInRange(start, end); // Output: 1 : Not a prime number

    }
}
