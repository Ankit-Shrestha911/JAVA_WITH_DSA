import java.util.*;

public class PairSum2 {

    // Two Pointer approach in sorted & rotated array list (self)
    static boolean pairTargetSum(ArrayList<Integer> list, int target) {

        // Step1. Find out pivot point(which mean that breaking point from where
        // arraylist is rotated)
        int pivotPoint = 0;

        while (list.get(pivotPoint) < list.get(pivotPoint + 1)) {
            pivotPoint++;
        }

        int leftPointer = pivotPoint + 1;
        int rightPointer = pivotPoint;

        while (rightPointer >= 0 && leftPointer < list.size()) {
            int currentSum = list.get(leftPointer) + list.get(rightPointer);
            if (currentSum == target)
                return true;

            if (currentSum > target) {
                rightPointer--;
                if (rightPointer == -1)
                    rightPointer = list.size() - 1;
            } else {
                leftPointer++;
                if (leftPointer == list.size())
                    leftPointer = 0;
            }

            if (leftPointer == rightPointer)
                break;

        }

        return false;

    }

    static boolean pairTargetSum2(ArrayList<Integer> list, int target) {

        // Step1. Find out pivot point(which mean that breaking point from where
        // arraylist is rotated)
        int pivotPoint = 0;
        int size = list.size();
        while (list.get(pivotPoint) < list.get(pivotPoint + 1)) {
            pivotPoint++;
        }

        int leftPointer = pivotPoint + 1;
        int rightPointer = pivotPoint;

        while (leftPointer != rightPointer) {
            int currentSum = list.get(leftPointer) + list.get(rightPointer);
            if (currentSum == target)
                return true;

            if (currentSum < target)
                leftPointer = (leftPointer + 1) % size;
            else
                rightPointer = (size + rightPointer + 1) % size;
        }

        return false;
    }

    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9, 10, 11, 1, 2, 3,
        // 4));
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 11, 12, 13, 6, 8, 9));
        System.out.println(pairTargetSum(list, 27)); // false
        System.out.println(pairTargetSum2(list, 27)); // false


    }
}