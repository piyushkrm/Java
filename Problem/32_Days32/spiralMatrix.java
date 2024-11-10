
// 54. Spiral Matrix
// Given an m x n matrix, return all elements of the matrix in spiral order.

import java.util.ArrayList;

public class spiralMatrix {

    public static int[] spiralOrder(int[][] matrix) {
        ArrayList<Integer> answer = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int startRow = 0;
        int endRow = m - 1;

        int startCol = 0;
        int endCol = n - 1;


        while (startRow <= endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {
                answer.add(matrix[startRow][j]);
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                answer.add(matrix[i][endCol]);
            }

            for (int j = endCol - 1; j >= startCol; j--) {
                if (startCol == endCol) {
                    break;
                }
                answer.add(matrix[endRow][j]);
            }

            for (int i = endCol - 1; i >= startCol + 1; i--) {
                if (startRow == endRow) {
                    break;
                }
                answer.add(matrix[i][startCol]);
            }

            startRow++; // Move down the top boundary
            endRow--;   // Move up the bottom boundary
            startCol++; // Move right the left boundary
            endCol--;   // Move left the right boundary

        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
 
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[] result = spiralOrder(matrix);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}