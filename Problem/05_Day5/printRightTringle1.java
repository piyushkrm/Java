import java.util.Scanner;

public class printRightTringle1 {

    public static void star(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Print right triangle star pattern
        Scanner sp = new Scanner(System.in);
        System.out.print("Enter n for height of star : ");
        int x = sp.nextInt();
        star(x);
    }
}
