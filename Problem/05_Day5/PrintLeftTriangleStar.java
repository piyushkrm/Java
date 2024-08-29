import java.util.Scanner;

public class PrintLeftTriangleStar {
    public static void printLeftTringleStar(int n) {
        for (int i = 1; i  <= n; i++) {
            for (int j = 1; j  <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j  <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int x = sp.nextInt();
        printLeftTringleStar(x);
    }
}
