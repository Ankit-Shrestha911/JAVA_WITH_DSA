public class palindromePattern{

    public static void printPalindromePattern(int input){
    

        for(int line=1; line<=input; line++)
        {
            //space
            for(int space=1; space<=(input-line); space++)
                    System.out.print(" ");
            
            //number first half
            for(int number1=line; number1>=1; number1--)
                System.out.print(number1);
            
            //number second half
            for(int number2 = 2; number2<=line; number2++)
                System.out.print(number2);
            
            System.out.println();
        }
    }

    public static void main(String[] args){

        printPalindromePattern(5);

    }
}
