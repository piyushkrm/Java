import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Backtracking {
    public static void stringPermutations(String string, String permulation, int index) {
        if (string.length() == 0) {
            System.out.println(permulation);
            return;
        }
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            String newString = string.substring(0, i) + string.substring(i + 1);
            stringPermutations(newString, permulation + currentChar, index + 1);
        }
    }

    public static boolean isSafe(int row, int col, char[][] board) {
        // horizontal
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // vertical
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // upper left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // upper right
        r = row;
        for (int c = col; c < board.length && r >= 0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // loe=wer left
        r = row;
        for (int c = col; c >= 0 && r < board.length; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower right
        for (int c = col; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void saveBoard(char[][] board, List<List<String>> allBoards) {
        String row = " ";
        List<String> newBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            row = " ";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public static void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }

    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        System.out.println("Question 1: Arrance th estring in a single line");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String string = sc.nextLine();
        stringPermutations(string, "", 0);

        System.out.println("Question 2: Print all solutions where Queens are safe -");
        int n = 4;
        solveNQueens(n);
    }
}
