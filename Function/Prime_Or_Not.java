public class Prime_Or_Not {

    // Only for value>=2
    public static boolean primeOrNot(int value) {

        // Corner Case
        if (value == 1)
            return false;

        /*
         * Brute force
         * boolean result = true;
         * for(int i=2; i<value; i++)
         * {
         * if(value%i ==0) return false;
         * 
         * }
         * return result;
         */

        // Bit optimize

        boolean result = true;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0)
                return false;

        }
        return result;
    }
    //Print prime in range
    public static void printPrime(int value) {

        for (int i = 2; i <= value; i++) {
            Boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) { // or for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }

            }

            if (check)
                System.out.print(i + " ");

        }

    }

    public static void main(String[] args) {

        // System.out.println(primeOrNot(4));
        printPrime(5);
        System.out.println();

        // for (int i = 1; i <= 11; i++) {
        //     if (primeOrNot(i))
        //         System.out.print(i + " ");
        // }

    }

}
