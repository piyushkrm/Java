import java.util.Scanner;

public class hollowTriangle {

    /**
     * The function `printHollowTriangles` in Java prints a pattern of hollow triangles based on the
     * input number `n`.
     * 
     * @param n The `printHollowTriangles` method you provided seems to be intended to print a pattern
     * of hollow triangles. However, there seems to be a missing `System.out.println();` statement
     * after the inner loop in the second part of the method, which is causing the output to be printed
     * on the same
     */
    public static void printHollowTriangles(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                }
            }
        }
    }

    public static void main(String[] args) {
        // Hollow triangles pattern problem
        // int n = 5; // size of the triangle
        Scanner sx = new Scanner(System.in);
        System.out.print("Enter the number of star : ");
        int n = sx.nextInt();
        printHollowTriangles(n);
    }
}
