public class _01Triangle {
    public static void main(String[] args) {

        int input = 7;

        for (int line = 1; line <= input; line++) {
            for (int number = 1; number <= line; number++) {
                if ((line % 2 != 0 && number % 2 == 0) || (line % 2 == 0 && number % 2 != 0))
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }

    }

}

/*
 *Note:  One -> (Even,Odd) or (Odd,Even) position we need to handle both case.
 */
