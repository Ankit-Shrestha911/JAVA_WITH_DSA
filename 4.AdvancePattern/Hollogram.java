public class Hollogram {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;

        for (int line = 1; line <= rows; line++) {
            for (int star = 1; star <= cols; star++) {
                if (line == 1 || line == rows || star == 1 || star == cols)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

}
