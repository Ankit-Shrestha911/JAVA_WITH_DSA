import java.util.*;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte a = 1;
        short b = a;

        int x = 14;
        float y = x;

        /*
         * Below is not possible
         * double xx = 10.11;
         * long yy = xx;
         * 
         */

        /*
         * int input = sc.nextFloat(); not valid
         * float input = sc.nextInt(); its valid here java automatically convert int to float
         * 
         */

    }
}

/*
 * Type Conversion means convert one type of data into another when it is
 * compaitable.
 * For example:
 * Hieraichal of conversion: byte->short->char->int->long->float->double
 * Reverse of the above is not possible.
 * 
 * Note: Decimal number by default in java considered as double. So we need to
 * manually add 'f' at the end of number
 * Example:
 * float b = 3.25f
 * 
 * TypeConversion alternative names are widening,implicit
 * 
 */
