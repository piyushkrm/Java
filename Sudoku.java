import java.util.ArrayList;

public class Sudoku {

    public static boolean isSafe(char[][] board, int row, int col, int num) {
        // column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (num + '0')) {
                return false;
            }
        }

        // row
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == (char) (num + '0')) {
                return false;
            }
        }

        // grid
        int startingRow = 3 * (row / 3);
        int startingCol = 3 * (col / 3);

        for (int i = startingRow; i < startingRow + 3; i++) {
            for (int j = startingCol; j < startingCol + 3; j++) {
                if (board[i][j] == (char) (num + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean helper(char[][] board, int row, int col) {
        int nrow = 0;
        int ncol = 0;

        if (col == board.length - 1) {
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = row;
            ncol = col + 1;
        }

        if (board[row][col] != '.') {
            if (helper(board, nrow, ncol)) {
                return true;
            } else {
                // fill the place
                for (int i = 1; i <= 9; i++) {
                    if (isSafe(board, row, col, i)) {
                        board[row][col] = (char) (i + '0');
                        if (helper(board, nrow, ncol)) {
                            return true;
                        } else {
                            board[row][col] = '.';
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {

        char[][] board = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 0, 9, 8, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 0, 0, 0, 0, 0 },
                { 0, 0, 8, 0, 0, 0, 0, 7, 9 }
        };
        helper(board, 0, 0);

    }

}
