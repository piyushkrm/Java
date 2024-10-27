import java.util.Scanner;

public class SquareStarPattern4 {
    public static void print(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //  Square Star Pattern: This pattern forms a square with stars.
        Scanner sp = new Scanner(System.in);
        System.out.print("Enter column : ");
        int p = sp.nextInt();
        print(p);
    }
}
