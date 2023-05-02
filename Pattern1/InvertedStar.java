public class InvertedStar {
    public static void main(String[] args) {
        int n = 4;
        /*
         * for (int line = n; line >= 1; line--) {
         * for (int star = line; star >= 1; star--) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        // Another Way without reversing the loop

        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= (n - line + 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
