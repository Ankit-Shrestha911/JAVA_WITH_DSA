public class test {
    public static void printFloydTriangle(int input) {
        int printNumber = 1;
        for (int line = 1; line <= input; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(printNumber);
                printNumber++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printFloydTriangle(5);

    }

}
