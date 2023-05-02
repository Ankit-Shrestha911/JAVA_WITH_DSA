public class decmialtobinary {

    public static int decmialToBinary(int decimalNumber) {
        int sum = 0;
        int counter = 0;

        while (decimalNumber > 0) {
            int digit = decimalNumber % 2;
            sum = sum + (digit * (int) Math.pow(10, counter));
            decimalNumber = decimalNumber / 2;
            counter++;
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(decmialToBinary(10));

    }

}
