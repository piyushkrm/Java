import java.util.Scanner;

public class InvertedPyramidStarPattern6 {

    public static void print(int x) {
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j < x; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        //  Inverted Pyramid Star Pattern: This pattern forms an inverted pyramid with stars.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the column number : ");
        int x = sc.nextInt();
        print(x);
    }
}
