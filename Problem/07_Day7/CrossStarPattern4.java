import java.util.Scanner;

public class CrossStarPattern4 {

/**
 * The `crossPattern` function in Java prints a cross pattern of asterisks based on the specified size.
 * 
 * @param size The `size` parameter in the `crossPattern` method represents the size of the cross
 * pattern that will be printed. The pattern consists of two diagonals of asterisks that cross each
 * other. The size determines the number of asterisks in each diagonal and the overall size of the
 * pattern.
 */
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
