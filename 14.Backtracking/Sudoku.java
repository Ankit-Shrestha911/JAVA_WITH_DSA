public class Sudoku {

    static boolean isSafe(int board[][], int rows, int cols, int digit) {
        // columns
        for (int i = 0; i <=8; i++) {
            if (board[i][cols] == digit)
                return false;
        }

        // rows
        for (int j = 0; j <=8; j++) {
            if (board[rows][j] == digit)
                return false;
        }

        // grid
        int startRows = (rows / 3) * 3;
        int startCols = (cols / 3) * 3;

        for (int i = startRows; i < startRows + 3; i++) {
            for (int j = startCols; j < startCols + 3; j++) {
                if (board[i][j] == digit)
                    return false;
            }
        }

        return true;

    }

    static boolean sudokuSolver(int board[][], int rows, int cols) {
        // base
        if (rows == 9)
            return true;

        int nextRows = rows, nextCols = cols + 1;
        if (cols+1 == 9) {
            nextRows = rows + 1;
            nextCols = 0;
        }

        if (board[rows][cols] != 0) {
            return sudokuSolver(board, nextRows, nextCols);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(board, rows, cols, digit)) {
                board[rows][cols] = digit;
                if (sudokuSolver(board, nextRows, nextCols)) {
                    return true;
                }

                board[rows][cols] = 0;
            }
        }

        return false;
    }

    static void printSolution(int board[][]) {

        for (int rows = 0; rows < board.length; rows++) {
            for (int cols = 0; cols < board[0].length; cols++) {
                System.out.print(board[rows][cols] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int board[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };

        if (sudokuSolver(board, 0, 0)) {
            printSolution(board);
        } else {
            System.out.println("Solution not exist.");
        }

    }

}