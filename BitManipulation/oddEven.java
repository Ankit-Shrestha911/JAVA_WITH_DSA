import java.util.*;

public class oddEven {

    public static void checkEvenOdd(int n) {
        if ((n & 1) == 1)
            System.out.println("Odd");
        else
            System.out.println("Even");

    }

    public static void main(String[] args) {
        checkEvenOdd(12);
    }
}