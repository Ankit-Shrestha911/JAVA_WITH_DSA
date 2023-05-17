public class Number {

    public static void decreasingOrder(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        decreasingOrder(n - 1);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        // decreasingOrder(10);
        // System.out.println(factorial(4));
        for (int i = 0; i < 26; i++) {
            System.out.print(fibonacci(i)+" ");
        }
    }
}
