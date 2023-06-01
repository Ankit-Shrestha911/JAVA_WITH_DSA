import java.util.*;

public class ContainerWithMostWater {
    // Brute force approach Time: O(n^2) Space: O(1)
    static int printContainerWithMostWater(ArrayList<Integer> list) {
        if (list.size() == 0 || list.size() == 1)
            return 0;
        int maxWater = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int width = j - i;
                int height = Math.min(list.get(i), list.get(j));

                maxWater = Math.max(maxWater, height * width);
            }
        }
        return maxWater;
    }

    // Two Pointer approach Time: O(n) Space: O(1)

    static int printContainerWithMostWater2(ArrayList<Integer> list) {
        if (list.size() == 0 || list.size() == 1)
            return 0;

        int leftPointer = 0;
        int rightPointer = list.size() - 1;
        int answer = 0;
        while (leftPointer < rightPointer) {
            int width = rightPointer - leftPointer;
            int height = Math.min(list.get(leftPointer), list.get(rightPointer));
            answer = Math.max(answer, width*height);

            if(list.get(leftPointer)<list.get(rightPointer))
                leftPointer++;
            else
                rightPointer--;
        
        }

        return answer;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7));
        System.out.println("output: " + printContainerWithMostWater2(list));
    

    }
}