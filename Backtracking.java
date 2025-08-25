// Problem: Place N queens on a chessboard so no two attack each other.

public class NQueens {
    static int N = 4;

    static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
        System.out.println();
    }

    static boolean isSafe(int[][] board, int row, int col) {
        for (int i = 0; i < col; i++)
            if (board[row][i] == 1) return false;
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1) return false;
        for (int i = row, j = col; i < N && j >= 0; i++, j--)
            if (board[i][j] == 1) return false;
        return true;
    }

    static boolean solveNQ(int[][] board, int col) {
        if (col >= N) {
            printBoard(board);
            return true;
        }
        boolean res = false;
        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;
                res = solveNQ(board, col + 1) || res;
                board[i][col] = 0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] board = new int[N][N];
        if (!solveNQ(board, 0))
            System.out.println("No solution exists");
    }
}
