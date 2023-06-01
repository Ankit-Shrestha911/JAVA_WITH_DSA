public class QuickSort {

    static int partition(int arr[], int start, int end) {
        int pivot = arr[end];

        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                // make space for smaller element than pivot
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // set pivot value in the correct place
        i++; // make space
        // swap
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;

        return i; // return the pivot value index

    }

    static void quickSort(int arr[], int start, int end) {
        if (start >= end)
            return;

        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, end);
    }

    static void printArray(int arr[]) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 0, 6, 4, 3};
        System.out.println("Before: ");
        quickSort(arr, 0, arr.length - 1);
        System.out.println("After: ");
        // printArray(arr);

    }
}
