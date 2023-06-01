public class solidRhombus{
    
    public static void printRhombus(int input){

        for(int line=1; line<=input; line++){
            //space
            for(int space=1; space<=(input-line); space++)
                System.out.print(" ");
            //Star
            for(int star=1; star<=input; star++)
                System.out.print("*");

            System.out.println();
        }
    }
    
    public static void main(String[] args){
        printRhombus(10);

    }
}