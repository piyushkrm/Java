import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println("* * * * *");
        }
        System.out.println("Question 1");
        System.out.println("Enter two numbers for print rectangle star :");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ROW number : ");
        int a1 = sc.nextInt();
        System.out.print("Enter COLUMN number : ");
        int a2 = sc.nextInt();
        for (int i = 1; i < a1; i++) {
            for (int j = 1; j < a2; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println("Question 2");
        System.out.println("Print the hollow rectangle");
        Scanner rs = new Scanner(System.in);
        System.out.print("Enter row : ");
        int r = rs.nextInt();
        System.out.print("Enter column : ");
        int s = rs.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= s; j++) {
                if (i == 1 || j == 1 || i == r || j == s) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("Question 3");
        System.out.println("Print half pyramid");
        System.out.print("Enter number or ROW for create half peramind : ");
        Scanner sf = new Scanner(System.in);
        int k = sf.nextInt();
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println("Question 4");
        System.out.println("Print half pyramid : ");
        for (int i = k; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Question 5");
        Scanner sd = new Scanner(System.in);
        int x = sd.nextInt();
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        System.out.println("Question 6");
        System.out.print("Enter number for print pyramid with numbers : ");
        Scanner sv = new Scanner(System.in);
        int n = sv.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("Question 7");
        System.out.print("Enter number for print inverted pyramid with number : ");
        Scanner sb = new Scanner(System.in);
        int b = sb.nextInt();
        for (int i = b; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("Question 8");
        System.out.print("Enter the number for print Floyd's Triangle : ");
        Scanner sq = new Scanner(System.in);
        int e = sq.nextInt();
        int number = 1;
        for (int i = 1; i <= e; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }

        System.out.println("Question 9");
        System.out.print("Enter the number for print 0 - 1 pattern tringle : ");
        Scanner sw = new Scanner(System.in);
        int p = sw.nextInt();
        int y = 0;
        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= i; j++) {
                y = i + j;
                if (y % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

        System.out.println("Question 10");
        System.out.print("Enter number for print inverted pyramid with number : ");
        Scanner scc = new Scanner(System.in);
        int d = scc.nextInt();
        for (int i = d; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= d; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
