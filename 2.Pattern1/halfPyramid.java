public class halfPyramid {
    public static void main(String[] args) {
        int input = 4;

        for (int line = 1; line <= input; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }

}
