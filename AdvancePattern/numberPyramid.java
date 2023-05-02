public class numberPyramid{

    public static void printNumberPyramid(int input){
      
        for(int line=1; line<=input; line++){

            //space
            for(int space=1; space<=(input-line); space++)
                System.out.print(" ");
            //Number
            for(int number=1; number<=line;number++)
                System.out.print(line+" ");
            
         
            System.out.println();
        }


        


    }

    public static void main(String[] args){
        printNumberPyramid(5);

    }
}