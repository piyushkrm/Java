import java.util.Scanner;

public class ButterflyPattern2 {

    public static void print(int n) {

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print left half of the row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print right half of the row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n; i >= 1; i--) {
            // Print left half of the row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Print right half of the row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Butterfly Pattern: This pattern looks like a butterfly, with two symmetrical
        // sides filled with stars.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the butterfly pattern : ");
        int n = sc.nextInt();
        print(n);
    }
}
