public class TypePromotion {
    public static void main(String[] args) {
        // Rule1

        short x = 12;
        byte y = 1;
        char z = 'a';

        int result = x + y + z;

        System.out.println(result);

        // Rule2

        int a = 12;
        float b = 13.44f;
        long c = 14;
        double d = 12.11;

        double result1 = a + b + c;

        System.out.println(result1);

    }
}

/*
 * Type Promotion is triggered when we using expersion i.e (+,-,*,/)
 * Rule 1: Java automatically promotes each byte,short or char operands into int
 * when evaluating an expression.
 * a = operand + operand
 * Rule 2: If one operand is long, float, double the whole expression is
 * promoted to which one is large in the previous one.
 * 
 * *note: Max in float, long is float and max in double,float is double
 * 
 */