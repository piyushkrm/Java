
// 240. Search a 2D Matrix II
// Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

// Integers in each row are sorted in ascending from left to right.
// Integers in each column are sorted in ascending from top to bottom.


public class search2DMatrixII {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;

        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (target == matrix[row][col]) {
                return true;
            } else if (target < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // Test cases
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.out.println(searchMatrix(matrix, 5)); // true
        System.out.println(searchMatrix(matrix, 20)); // false
    }
}
