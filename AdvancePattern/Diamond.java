public class Diamond{

    public static void printDiamond(int input){
        //Part1
        int starCounter=1;
        for(int line=1; line<=input; line++){

            //space
            for(int space=1; space<=(input-line); space++)
                System.out.print(" ");
            //Star
            for(int star=1; star<=starCounter;star++)
                System.out.print("*");
            
            starCounter = starCounter+2;
         
            System.out.println();
        }
        

        //Part2
        starCounter = starCounter-2;
        for(int line=input; line>=1; line--){
            //space
            for(int space=1; space<=(input-line); space++)
                System.out.print(" ");
            
            //star
            for(int star=1; star<=starCounter; star++)
                System.out.print("*");
            
            starCounter=starCounter-2;
            System.out.println();
            
        }

        


    }

    public static void main(String[] args){
        printDiamond(10);

    }
}