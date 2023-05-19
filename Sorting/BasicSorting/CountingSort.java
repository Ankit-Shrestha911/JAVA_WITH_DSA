public class CountingSort {

    static void countingSort(int arr[]) {
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxValue = Math.max(maxValue, arr[i]);
            minValue = Math.min(minValue, arr[i]);
        }

        int freqArray[] = new int[maxValue+minValue];

        for (int i = 0; i < arr.length; i++) {
            freqArray[arr[i]]++;
        }

        for (int i = 0; i < freqArray.length; i++) {
            int occurence = freqArray[i];

            while (occurence > 0) {
                System.out.print(i + " ");
                occurence--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {100,50,20};
        countingSort(arr);
    }
}