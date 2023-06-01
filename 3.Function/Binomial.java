public class Binomial {

    public static int factorial(int value) {
        int result = 1;
        for (int number = 1; number <= value; number++)
            result *= number;

        return result;
    }

    public static int binomialCoefficient(int n, int r) {
        // Formula is nCr = n!/(n-r)!r!
        return (factorial(n) / (factorial(n - r) * factorial(r)));

    }

    public static void main(String[] args) {
        System.out.println(binomialCoefficient(5, 2));

    }

}
