public class fastExponential {

    public static double getFastExponential(int number, int power) {
        if (power == 0)
            return 1;
        int answer = 1;
        while (power > 0) {
            if ((power & 1) == 1)
                answer = answer * number;

            number = number * number;

            power = power >> 1;

        }

        return answer;
    }

    public static int clearBitsInRange(int num, int start, int end) {
        int mask = ((1 << (end - start + 1)) - 1) << start;
        return num & ~mask;
    }

    public static void main(String[] args) {

        //System.out.println(getFastExponential(3,4));
        System.out.println(clearBitsInRange(31, 1, 3));
    }
}
