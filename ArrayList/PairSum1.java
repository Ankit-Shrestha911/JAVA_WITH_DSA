import java.lang.reflect.Array;
import java.util.*;

public class PairSum1 {

    // 1. Brute force O(n^2)
    static boolean pairTargetSum(ArrayList<Integer> pairSum, int target) {

        for (int i = 0; i < pairSum.size(); i++) {
            for (int j = i + 1; j < pairSum.size(); j++) {
                if (pairSum.get(i) + pairSum.get(j) == target)
                    return true;
            }
        }

        return false;
    }

    // 2. Two Pointer approach Time: O(n)

    static boolean pairTargetSum2(ArrayList<Integer> list, int target) {
        int leftPointer = 0;
        int rightPointer = list.size() - 1;

        while (leftPointer < rightPointer) {
            int currentPair = list.get(leftPointer) + list.get(rightPointer);
            if (currentPair == target){
                return true;
            }  

            if (currentPair > target)
                rightPointer--;
            else
                leftPointer++;
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println(pairTargetSum(list, 10));
        System.out.println(pairTargetSum2(list, 7));
    }
}
