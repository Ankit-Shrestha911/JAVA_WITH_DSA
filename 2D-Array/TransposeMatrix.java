public class TransposeMatrix {

    public static void printTransposeMatrix(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int TransposeMatrix[][] = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                TransposeMatrix[j][i] = matrix[i][j];

            }
        }

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(TransposeMatrix[i][j]+" ");

            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 5, 6, 7},
                {8,9,10}

        };

        printTransposeMatrix(matrix);


    }
}

/*
 * Example:
 * {1,2,3,4}
 * {5,6,7,8,9}
 *                   trans matrix  trans matrix
 * Transpose: {1 5}  (0,0)=(0,0) | (0,1)=(1,0)
 *            {2,6}  (1,0)=(0,1) | (1,1)=(1,1)
 *            {3,7}  (2,0)=(0,2) | (2,1)=(1,2)
 *            {8,9}  (3,0)=(0,3) | (3,1)=(1,3)
 */