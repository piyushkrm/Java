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

    // Best approach 3 to find a prime number in a range
    public static int countPrimes(int n) {
        if (n <= 2)
            return 0; // There are no prime numbers less than 2

        boolean[] isPrime = new boolean[n];
        for (int i = 0; i < n; i++) {
            isPrime[i] = true; // Assume all numbers are prime initially
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++; // Increment count for each prime number found
                for (int j = i * 2; j < n; j += i) {
                    isPrime[j] = false; // Not a prime number, Mark multiples of i as non-prime
                }
            }
        }
        return count; // Return the total count of primes less than n
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
        end = 120;
        checkPrimeInRange2(start, end); // Output: 1 : Not a prime number

        int num = 50;
        System.out.println("Count of primes between 1 and " + num + ": " + countPrimes(num + 1)); // Output: 7
        System.out.println();
    }
}
