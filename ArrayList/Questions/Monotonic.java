import java.util.ArrayList;
import java.util.Arrays;

public class Monotonic {

    static boolean isMonotonic(ArrayList<Integer> list) {
        boolean increaing = true;
        boolean decreasing = true;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1))
                increaing = false;
            if (list.get(i) < list.get(i + 1))
                decreasing = false;
        }

        return increaing || decreasing;
    }

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,2,2,3)); //true
        ArrayList<Integer>list2 = new ArrayList<>(Arrays.asList(1,3,2)); //false
        System.out.println(isMonotonic(list));
        System.out.println(isMonotonic(list2));
       
}
}
