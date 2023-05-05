
public class diagonalSum{

    public static int getDiagonalSum(int matrix[][])
    {
        int row = matrix.length-1;
        int col = row;
        int commonStart = 0;
        int sum = 0;
        if(row != col) return 0;

        if(row == 1 && col == 1) return matrix[0][0];

        while(commonStart<=row && col>=0)
        {
            sum = sum+matrix[commonStart][commonStart]+matrix[commonStart][col];

            commonStart++;
            col--;
        }


        
        return ((row+1)%2!=0)?sum-matrix[(row+1)/2][(row+1)/2]:sum;

    }
    public static void main(String[] args){
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.print(getDiagonalSum(matrix));        
    }
}