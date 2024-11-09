/**
 * The `search2DMatrix` class in Java implements a binary search algorithm to find a target integer in
 * a 2D matrix with specific properties efficiently.
 */

// 74 Search a 2D Matrix
// You are given an m x n integer matrix matrix with the following two properties:

// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// You must write a solution in O(log(m * n)) time complexity.

public class search2DMatrix {

    public static boolean searchRow(int[][] matrix, int target, int row) {
        int newRow = matrix[0].length;
        int startCol = 0;
        int endCol = newRow - 1;

        while (startCol <= endCol) {
            int midCol = startCol + (endCol - startCol) / 2;
            if (matrix[row][midCol] == target) {
                return true;
            } else if (matrix[row][midCol] < target) {
                startCol = midCol + 1;
            } else {
                endCol = midCol - 1;
            }
        }
        return false;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;

        int startRow = 0;
        int endRow = rows - 1;

        while (startRow <= endRow) {
            int midRow = startRow + (endRow - startRow) / 2;

            // Access the last element in midRow correctly
            if (target >= matrix[midRow][0] && target <= matrix[midRow][matrix[0].length - 1]) {
                return searchRow(matrix, target, midRow);
            }

            else if (target > matrix[midRow][rows - 1]) {
                startRow = midRow + 1;
            } else {
                endRow = midRow - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        int[][] matrix1 = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };
        int target = 34;
        System.out.println(searchMatrix(matrix1, target)); // Output: true
    }
}
