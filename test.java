public class test {

        public static void spiralPrint(int matrix[][])
        {
            int startCol = 0;
            int startRow = 0;
            int endCol = matrix[0].length-1;
            int endRow = matrix.length-1;


            while(startCol<=endCol && startRow<=endRow)
            {
                //top
                for(int col =startCol; col<=endCol; col++)
                    System.out.print(matrix[startRow][col]+" ");
                
                //right
                for(int row = startRow+1; row<=endRow; row++)
                    System.out.print(matrix[row][endCol]+" ");
                
                //bottom
                for(int col = endCol-1; col>=startCol; col--){
                    if(startRow==endRow) break;
                    System.out.print(matrix[endRow][col]+" ");
                }

                //left

                for(int row = endRow-1; row>=startRow+1; row--){
                    //if(startCol==endCol) break;
                    System.out.print(matrix[row][startCol]+" ");
                }
                

                startCol++;
                startRow++;
                endCol--;
                endRow--;
            }
        }
    
        public static void main(String[] args) {
            int matrix[][] = {
               {1,2,3,4,0},
               {5,6,7,8,1},
               {9,10,11,12,2},
               {13,14,15,16,3}

            };

            spiralPrint(matrix);
            
        }
       
    }
