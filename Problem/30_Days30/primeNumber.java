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

    // Check numbers are prime numbers in a range approach 1
    public static void checkPrimeInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i + " : " + isPrime(i));
        }
    }

    // Check numbers are prime numbers in a range approach 2
    public static void checkPrimeInRange2(int start, int end) {
        for (int num = start; num <= end; num++) {
            if (num < 0)
                continue;
            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " : Prime number");
            } else {
                System.out.println(num + " : Not a prime number");
            }
        }
    }

    public static void main(String[] args) {
        int number = 24;
        System.out.println(isPrime(number)); // Output: Not a prime number
        System.out.println();

        int start = 1;
        int end = 20;
        checkPrimeInRange(start, end); // Output: 1 : Not a prime number
        System.out.println();

        start = 100;
        end = 200;
        checkPrimeInRange2(start, end); // Output: 1 : Not a prime number
    }
}
