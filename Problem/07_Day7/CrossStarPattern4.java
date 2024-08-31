public class CrossStarPattern4 {

    public static void crossPattern(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            
            System.out.println();
        }


        // for (int i = 0; i < size; i++) {
        //     for (int j = 0; j < size; j++) {
        //         if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // System.out.println();
        // for (int i = 0; i < size; i++) {
        //     for (int j = 0; j < size; j++) {
        //         if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // System.out.println
    }
    public static void main(String[] args) {
        // Cross Star Pattern: This pattern prints a cross shape with stars.
        int n = 5;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (i == j || i == n - j - 1) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        crossPattern(n);
    }
}
