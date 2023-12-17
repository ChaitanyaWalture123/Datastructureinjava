package daa.pract.five;
import java.util.Scanner;

import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] board = new int[n][n];

        // Place the first Queen (row 0, col 0)
        board[0][0] = 1;

        if (solveNQueens(board, 1, n)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    public static boolean solveNQueens(int[][] board, int row, int n) {
        if (row == n) {
            return true; // All Queens are placed
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 1;
                if (solveNQueens(board, row + 1, n)) {
                    return true; // Successfully placed all Queens
                }
                board[row][col] = 0; // Backtrack
            }
        }

        return false; // No solution found for this placement
    }

    public static boolean isSafe(int[][] board, int row, int col, int n) {
        // Check the column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
