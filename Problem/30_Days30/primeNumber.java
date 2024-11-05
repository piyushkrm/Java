// Prime number problem

public class primeNumber {

    public static String isPrime(int x) {
        for (int i = 2; i * i < x; i++) {
            if (x % i == 0) {
                return "Not a prime number";
            }
        }
        return "Prime number";
    }

    public static void main(String[] args) {

    }
}
