import java.util.*;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // float valueX = 25.12f;
        // int valueY = (int)valueX;

        // System.out.println(valueY);

        int value = 1234;
        byte x = (byte) value;

        System.out.println(x);

    }

}

/*
 * Type Casting means we forcefully assign the data into incompaitable types. In
 * java we said it lossy conversion.
 * Risk of lossing the data.
 * See the above code, we loss decimal value while doing type casting
 * Alternative names are: narrowing,explicit
 */
