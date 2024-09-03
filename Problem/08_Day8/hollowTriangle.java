import java.util.Scanner;

public class hollowTriangle {

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
