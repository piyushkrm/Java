import java.util.Scanner;
public class hollowSquare1 {

    public static void print(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (j == 0 || j == x) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Hollow square with streaks
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print number of streak : ");
        int n = sc.nextInt();
        // int n = 10;
        print(n);
    }
}
