import java.util.Scanner;
public class HollowSquareStarPattern1 {

    public static void print(int x) {
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= x; j++) {
                if (i == 0 || i == x  || j == 0 || j == x) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Hollow Square Star Pattern: This pattern prints a square but leaves the middle portion hollow.S
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter column : ");  // User input for the size of the square.  // 5
        int x = scanner.nextInt();
        print(x);
    }
}
