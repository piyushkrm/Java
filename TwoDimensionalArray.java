import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int row = sc.nextInt();
        System.out.print("Enter Columns : ");
        int column = sc.nextInt();
        int matrix[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter " + i + " Rows and " + j + " Column : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is like : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter number for searching : ");
        int input = sc.nextInt();
        for (int k = 0; k < row; k++) {
            for (int k2 = 0; k2 < column; k2++) {
                if (matrix[k][k2] == input) {
                    System.out.println("Here is your searched number available : (" + k + ", " + k2 + ")");
                }
            }
        }
    }
}