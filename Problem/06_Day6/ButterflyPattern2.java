import java.util.Scanner;

public class ButterflyPattern2 {

    public static void print(int x) {
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Butterfly Pattern: This pattern looks like a butterfly, with two symmetrical sides filled with stars.
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the height of the butterfly pattern : ");
        // int n = sc.nextInt();
        int n = 10;
        print(n);
    }
}
