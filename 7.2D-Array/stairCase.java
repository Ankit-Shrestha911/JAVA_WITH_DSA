
public class stairCase{

    public static boolean stairCaseSearch1(int matrix[][], int key)
    {
        // start with top right
        int row= matrix.length-1;
        int col = matrix[0].length-1;
        int start =0 ;

        while(start<=row && col>=0)
        {
            if(key == matrix[start][col])
                return true;
            else if(key < matrix[start][col])
                 col--;
            else    
                start++;
     

        }


        return false;
        
    }



    public static void main(String[] args){
        int matrix[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };

        System.out.print(stairCaseSearch1(matrix,27));
        


    }
}