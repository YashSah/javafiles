package Recursion.backtracking;

import java.util.*;

public class sudoku {
    public static void display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void solveSudoku(int[][] board, int i, int j) {
        if (i == board.length) {
            display(board);
            return;
        }
        int ni = 0; // next i
        int nj = 0; // next j
        if (j == board[0].length - 1) {
            ni = i + 1;
            nj = 0;
        } else {
            ni = i;
            nj = j + 1;
        }
        if (board[i][j] != 0) {
            solveSudoku(board, ni, nj);
        } else {
            for (int po = 1; po <= 9; po++) // po-> possible options
            {
                if (isValid(board, i, j, po) == true) {
                    board[i][j] = po;
                    solveSudoku(board, ni, nj);
                    board[i][j] = 0;
                }
            }
        }
    }

    public static boolean isValid(int[][] board, int x, int y, int val) {
        for (int j = 0; j < board[0].length; j++) {
            if (board[x][j] == val) {
                return false;
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i][y] == val) {
                return false;
            }
        }

        // if we need to find top left corner of any i,j submatrix of sudoku( 3x3)
        // matrix then we need to divide and multiply i and j with 3.
        int smi = x / 3 * 3; // i of submatrix
        int smj = y / 3 * 3; // j of submatric
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[smi + 1][smj + j] == val) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; i < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        solveSudoku(arr, 0, 0);
    }
}
