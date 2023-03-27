package Recursion.backtracking;

public class NQueens {
    boolean nQueen(int board[][], int row) {
        int N = 4;
        if (row == N) {
            return true;
        }
        for (int col = 0; col < N; col++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 1;
                if (nQueen(board, row + 1)) {
                    return true;
                }
                board[row][col] = 0; // backtracking
            }
        }
        return false;
    }

    public static boolean isSafe(int row, int col, int[][] board) {
        // for upper-vertical
        for (int i = row; i >= 0; i--) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // for upper-left diagonal
        int j = col;
        for (int i = row; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // for upper-right diagonal
        j = col;
        for (int i = row; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    public static void main(String args[]) {

    }
}
