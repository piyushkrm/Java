import java.util.Scanner;

public class PyramidStarPattern6 {

    public static void print(int x) {
        for (int i = 0; i <= x; i++) {
            for (int j = x; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Pyramid Star Pattern: This pattern forms a pyramid with stars.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the column : ");   
        int x = sc.nextInt();
        print(x);
    }
}
