import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class AdvancePttern {
    public static void main(String[] args) {
        System.out.println("Ouestion 1");
        System.out.println("Print the butterfly pattern with * : ");
        System.out.print("Enter the row number : ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int spaces;
        // upper half
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            spaces = 2 * (s - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        // lower half
        for (int i = s; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            spaces = 2 * (s - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println("Ouestion 2");
        System.out.println("Print the solid rhombus pattern : ");
        System.out.print("Enter the row number : ");
        Scanner st = new Scanner(System.in);
        int y = st.nextInt();
        for (int i = 1; i <= y; i++) {
            int space = (y - i);
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= y; j++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }

        System.out.println("Ouestion 3");
        System.out.println("Print the hollow rhombus pattern : ");
        System.out.print("Enter the row number : ");
        Scanner sr = new Scanner(System.in);
        int p = sr.nextInt();
        for (int i = 1; i <= p; i++) {
            int space = (p - i);
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= p; j++) {
                if (i == 1 || j == 1 || i == p || j == p) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Ouestion 4");
        System.out.println("Print the 2 * hollow rhombus pattern : ");
        System.out.print("Enter the row number : ");
        Scanner sx = new Scanner(System.in);
        int c = sx.nextInt();
        for (int i = 1; i <= c; i++) {
            int space = (c - i);
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= c; j++) {
                if (i == 1 || j == 1 || i == c || j == c || i == 2 || j == 2 || i == c - 1 || j == c - 1) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Question 5");
        System.out.println("Print the number trangle : ");
        System.out.print("Enter the number for height of the triangle : ");
        Scanner cs = new Scanner(System.in);
        int x = cs.nextInt();
        for (int i = x; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= x; j++) {
                System.out.print(x - i + 1 + " ");
            }
            for (int j = i + 1; j <= x; j++) {
                System.out.print(x - i + 1 + " ");
            }
            System.out.println();
        }

        System.out.println("Question 5 (Another Method) ");
        System.out.println("Print the number trangle : ");
        System.out.print("Enter the number for height of the triangle : ");
        Scanner cv = new Scanner(System.in);
        int o = cv.nextInt();
        for (int i = 1; i <= o; i++) {
            for (int j = 1; j <= o - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("Question 6");
        System.out.println("Print the Palindromic pattern : ");
        System.out.print("Enter the number for height of the palindromic : ");
        Scanner cl = new Scanner(System.in);
        int n = cl.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        System.out.println("Question 7");
        System.out.println("Print the Diamond pattern : ");
        System.out.print("Enter the row number for printing the diamond pattern : ");
        Scanner se = new Scanner(System.in);
        int cx = se.nextInt();
        for (int i = 0; i <= cx; i++) {
            for (int j = 1; j <= cx - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = cx; i >= 1; i--) {
            for (int j = 1; j <= cx - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}
