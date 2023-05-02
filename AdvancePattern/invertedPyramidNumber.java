public class invertedPyramidNumber {
    public static void printInvertedPyramidNumber(int input) {

        for (int line = input; line >= 1; line--) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printInvertedPyramidNumber(5);

    }

}
