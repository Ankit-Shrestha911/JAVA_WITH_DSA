public class NQueen {
    static int count = 0;
    static boolean isSafe(char board[][], int rows, int cols) {

        for (int i = rows - 1; i >= 0; i--) {
            if (board[i][cols] == 'Q') {
                return false;
            }
        }

        int i = rows - 1;
        int j = cols - 1;

        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q') {
                return false;
            }

            i--;
            j--;
        }

        i = rows - 1;
        j = cols + 1;

        while (i >= 0 && j < board[0].length) {
            if (board[i][j] == 'Q') {
                return false;
            }

            i--;
            j++;
        }

        return true;

    }

    // print all possible solution with count all solution
    static void printNQueenSolution(char board[][], int rows) {

        if (rows == board.length) {
            printSolution(board);
            count++;
            return;
        }

        for (int cols = 0; cols < board.length; cols++) {
            if (isSafe(board, rows, cols)) {
                board[rows][cols] = 'Q';
                printNQueenSolution(board, rows + 1);
                board[rows][cols] = 'x';
            }
        }
    }

    static void printSolution(char board[][]) {

        System.out.println("-----Chess board-------");
        for (int rows = 0; rows < board.length; rows++) {
            for (int cols = 0; cols < board[0].length; cols++) {
                System.out.print(board[rows][cols] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

    // print only one solution
    static boolean printNQueenSolution2(char board[][], int rows) {

        if (rows == board.length) {
            return true;
        }

        for (int cols = 0; cols < board.length; cols++) {
            if(isSafe(board, rows, cols)){
                board[rows][cols] = 'Q';
                if(printNQueenSolution2(board,rows+1)){
                    return true;
                }

                board[rows][cols] = 'x';
            }

        }

        return false;
    }

    public static void main(String[] args) {
        int n = 4;

        char board[][] = new char[n][n];

        for (int rows = 0; rows < board.length; rows++) {
            for (int cols = 0; cols < board[0].length; cols++) {
                board[rows][cols] = 'x';
            }
        }
        printNQueenSolution(board, 0);

        // if (printNQueenSolution2(board, 0)) {
        //     System.out.println("Yes");
        //     printSolution(board);
        // } else {
        //     System.out.println("No solution");
        // }

        System.out.println("No of possible solution is: "+count);
    }

}