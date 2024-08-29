import java.util.Scanner;

public class DiamondStarPattern7 {

    public static void print(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = x - 1; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 1; i < x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = x - 1; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Diamond Star Pattern: This pattern prints a diamond shape with stars.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of dimand pattern : ");
        int s = sc.nextInt();
        print(s);
    }
}
