public class InvertedPyramid {

    public static void printInvertedPyramid(int input) {

        for (int line = 1; line <= input; line++) {
            // space

            for (int space = 1; space <= (input - line); space++)
                System.out.print(" ");

            // star
            for (int star = 1; star <= line; star++)
                System.out.print("*");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        /*
         * int input = 4;
         * 
         * for (int line = input; line >= 1; line--) {
         * // space
         * for (int space = 1; space <= line - 1; space++)
         * System.out.print(" ");
         * 
         * // Star
         * 
         * for (int star = 1; star <= (input - line + 1); star++)
         * System.out.print("*");
         * 
         * System.out.println();
         * 
         * 
         * }
         */

        printInvertedPyramid(4);
    }

}
