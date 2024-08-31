import java.util.Scanner;

public class CrossStarPattern {

    /**
     * The function `printPlusStar` in Java prints a pattern of plus and star symbols based on the
     * input size.
     * 
     * @param size The `printPlusStar` method you provided seems to be intended to print a pattern of
     * plus and star symbols based on the size parameter. However, there are a few issues in the
     * implementation that need to be addressed.
     */
    public static void printPlusStar(int size) {
        for (int i = 0; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == size) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("* ");
            for (int j = 0; j <= size-1; j++) {
                if (i == size) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == size) {
                    System.out.print("  ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("* ");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Plush Star Pattern: This pattern prints a plush shape with stars.
        // The code snippet you provided is responsible for taking user input to determine the size of the
        // pattern to be printed. Here's a breakdown of what each line does:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stars for the pattern : ");
        int size = sc.nextInt();
        printPlusStar(size);
    }
}
