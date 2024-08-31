import java.util.Scanner;

public class CrossStarPattern4 {

    public static void crossPattern(int size) {
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = size; j >= 0; j--) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i <= size; i++) {
            for (int j = size; j >= 0; j--) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = 0; j <= size; j++) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Cross Star Pattern: This pattern prints a cross shape with stars.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value to print the pattern : ");
        int n = sc.nextInt();

        crossPattern(n);
    }
}
