import java.util.Scanner;

public class DownwardTriangleStarPattern1 {

    // The line `// int n = 5;` is a commented-out line in the code. It is not being
    // executed by
    // the program. Comments in programming are used to provide explanations or to
    // temporarily
    // disable certain lines of code without affecting the program's functionality.
    // In this case,
    // the line was likely used to set the value of `n` to 5 for the downward
    // triangle star
    // pattern, but it is currently commented out and not active in the program.
    public static void print(int x) {
        for (int i = x; i >= 1; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Downward Triangle Star Pattern: This pattern forms a downward-facing triangle
        // with stars.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int x = sc.nextInt();
        print(x);

    }
}
