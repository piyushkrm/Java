import java.util.Scanner;
public class HollowDiamondStarPattern2 {

    public static void printHollowDiamond(int size) {
        for (int i = size; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = size-1; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = size-1; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Hollow Diamond Star Pattern: This pattern prints a diamond shape with stars, leaving the middle portion hollow.
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the size of the diamond: ");
        // int size = scanner.nextInt();   // size of the diamond
        int size = 5;  // size of the diamond (for example)

        // print the hollow diamond pattern
        printHollowDiamond(size);
    }
}
