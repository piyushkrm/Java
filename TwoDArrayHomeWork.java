import java.util.Scanner;

public class TwoDArrayHomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Spiral Order Matrix is : ");
        int rowStart = 0;
        int rowEnd = n - 1;
        int columnStart = 0;
        int columnEnd = m - 1;

        // To print spiral matrix
        while (rowStart <= rowEnd && columnStart <= columnEnd) {

            // 1
            for (int column = columnStart; column <= columnEnd; column++) {
                System.out.print(matrix[rowStart][column] + " ");
            }
            rowStart++;

            // 2
            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(matrix[row][columnEnd] + " ");
            }
            columnEnd--;

            // 3
            for (int column = columnEnd; column >= columnStart; column--) {
                System.out.print(matrix[rowEnd][column] + " ");
            }
            rowEnd--;

            // 4
            for (int row = rowEnd; row >= rowStart; row--) {
                System.out.print(matrix[row][columnStart] + " ");
            }
            columnStart++;

            System.out.println();

        }

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
