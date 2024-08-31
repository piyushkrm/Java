public class CrossStarPattern {

    public static void printPlusStar(int size) {
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                if (i == size) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("* ");
            for (int j = 0; j <= size; j++) {
                if (i == size) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                if (i == size) {
                    System.out.print("  ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("* ");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Cross Star Pattern: This pattern prints a cross shape with stars.
        // int n = 5;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == j || i + j == n - 1) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        int n = 5;
        printPlusStar(n);
    }
}
