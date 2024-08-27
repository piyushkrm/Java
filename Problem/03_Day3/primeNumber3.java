import java.util.Scanner;

public class primeNumber3 {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(number); ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Find prime number from 1 to N number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to print the prime number from 1 : ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
