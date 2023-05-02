public class Factorial {

    public static int showFactorial(int value) {
        int result = 1;
        for (int number = 1; number <= value; number++) {
            result = result * number;
        }

        return result;

    }

    public static void main(String[] args) {
        int userInput = 5;

        System.out.println(showFactorial(userInput));
    }
}
