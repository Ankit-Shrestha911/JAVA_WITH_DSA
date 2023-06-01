import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(5);
        list.add(2);

        Collections.sort(list); // Ascending order
        Collections.sort(list,Collections.reverseOrder(null)); //descending order

        System.out.println(list);
    }
}
