public class binaryToDecimal {

    public static int binarytodecimal(int binaryNumber) {

        int sum = 0;
        int counter = 0;
        while (binaryNumber > 0) {
            int lastDigit = binaryNumber % 10;
            sum = sum + (int)(Math.pow(2, counter) * lastDigit);
            binaryNumber = binaryNumber / 10;
            counter++;
        }
        return sum;

    }

    public static void main(String[] args) {

        System.out.println(binarytodecimal(111));

    }

}
