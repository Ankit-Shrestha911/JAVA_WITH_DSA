import java.util.ArrayList;

public class RateInMaze {

    static boolean isSafe(int maze[][], int rows, int cols) {
        return (rows >= 0 && rows < maze.length && cols >= 0 && cols < maze.length && maze[rows][cols] == 1);
    }

    static boolean solveRateInMazeUtil(int maze[][], int rows, int cols, int solMaze[][]) {
        if (rows == maze.length - 1 && cols == maze.length - 1 && maze[rows][cols] == 1) {
            solMaze[rows][cols] = 1;
            printBoard(solMaze);
            return false;
        }

        if (isSafe(maze, rows, cols)) {
            if (solMaze[rows][cols] == 1)
                return false;

            solMaze[rows][cols] = 1;

            if (solveRateInMazeUtil(maze, rows + 1, cols, solMaze)) {
                return true;
            }

            if (solveRateInMazeUtil(maze, rows, cols + 1, solMaze)) {
                return true;
            }

            solMaze[rows][cols] = 0;
            return false;
        }

        return false;

    }

    static void solveRateInMaze(int maze[][], int rows, int cols) {
        int n = maze.length;
        int solMaze[][] = new int[n][n];
        
        // if(!solveRateInMazeUtil(maze,rows,cols,solMaze)) {
        //     System.out.println("Solution not exists!");
        //     return;
        // }

        solveRateInMazeUtil(maze, rows, cols, solMaze);
        // printBoard(solMaze);


    }

    static void printBoard(int maze[][]) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                System.out.print(maze[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int maze[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 1, 1 },
                { 1, 1, 1, 1 }
        };

        // solveRateInMaze(maze, 0, 0);
        int x = 23;
        String s = Integer.toString(x);
        System.out.println(s);
     

        
        
    }
}
