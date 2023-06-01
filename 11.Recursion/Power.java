public class Power {

    public static int calPower(int x, int n) { // time: O(n) space: O(n)
        if (n == 0)
            return 1;
        return x * calPower(x, n - 1);
    }

    public static int optimizeCalPower1(int x, int n) { // time: o(n)
        if (n == 0)
            return 1;

        if (n % 2 == 0)
            return optimizeCalPower1(x, n / 2) * optimizeCalPower1(x, n / 2);

        return x * optimizeCalPower1(x, n / 2) * optimizeCalPower1(x, n / 2);
    }

    public static int optimizeCalPower2(int x, int n) { // time: o(logn)
        /*
         * Here we call function only once for n/2 but in above we call multiple
         */
        if (n == 0)
            return 1;

            int halfPower = optimizeCalPower2(x, n/2);
            int halfPowerSquare = halfPower*halfPower;

            if(n%2 !=0)
                halfPowerSquare = x*halfPowerSquare;
        
        return halfPowerSquare;
    }

    public static void main(String[] args) {
        System.out.println(calPower(2, 10));
        System.out.println(optimizeCalPower1(2, 10));
        System.out.println(optimizeCalPower2(2, 10));
        
    }
}
