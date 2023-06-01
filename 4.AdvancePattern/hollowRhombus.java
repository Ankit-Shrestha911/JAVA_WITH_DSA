public class hollowRhombus{
    
    public static void printHollowRhombus(int input){

        for(int line=1; line<=input; line++){
            //space
            for(int space=1; space<=(input-line); space++)
                System.out.print(" ");
            //Star
            for(int star=1; star<=input; star++){
                if(line==1 || line==input || star==1|| star==input)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
    

    public static void main(String[] args){
        printHollowRhombus(5);
    }
}