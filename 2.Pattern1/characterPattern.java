public class characterPattern {
    public static void main(String[] args) {
        int input = 4;
        char alpha = 'A';

        for (int line = 1; line <= input; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(alpha);
                alpha++;
            }
            System.out.println();
        }
    }
}
