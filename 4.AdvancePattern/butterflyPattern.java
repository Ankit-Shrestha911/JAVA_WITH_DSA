public class butterflyPattern{
    
    public static void printButterfly(int input){
        //Part1
        
        for(int line=1; line<=input; line++){
            //Star
            for(int star=1; star<=line; star++)
                System.out.print("*");
            //Space
            for(int space=1; space<=(input-line)*2; space++)
                System.out.print(" ");
            //star

            for(int star=1; star<=line; star++)
                System.out.print("*");

            System.out.println();

        }

        for(int line=input; line>=1; line--){
            //star
            for(int star=1; star<=line; star++){
                System.out.print("*");
            }
            //space
            for(int space=1; space<=(input-line)*2; space++){
                    System.out.print(" ");
            }

            //star
            for(int star=1; star<=line; star++)
                System.out.print("*");
            
           
            System.out.println();

        }

    }

        

    public static void main(String[] args){
        printButterfly(4);
    }
}
