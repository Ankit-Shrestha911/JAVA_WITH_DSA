import java.util.*;;

public class LonelyNumber {

    static boolean isDuplicate(ArrayList<Integer> list, int value) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value)
                count++;
        }

        return count >= 2;
    }

    static ArrayList<Integer> lonelyNumber(ArrayList<Integer> list) {
        if (list.isEmpty())
            return list;
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int currElement = list.get(i);
            if (!list.contains(currElement - 1) && !list.contains(currElement + 1) && !isDuplicate(list, currElement)) {
                answer.add(currElement);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 3));

        System.out.println(lonelyNumber(list));
    }
}
