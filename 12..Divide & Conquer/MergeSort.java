public class MergeSort {

    public static void mergeSort(int arr[], int si, int en) {
        int temp[] = new int[arr.length];
        mergeSortHelper(arr, temp, si, en);
    }

    public static void mergeSortHelper(int arr[], int temp[], int si, int en) {
        // base case
        if (si >= en)
            return;

        int mid = (si + en) / 2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, en);
        mergeSortedArray(arr, temp, si, mid, en);

    }

    public static void mergeSortedArray(int arr[], int temp[], int si, int mid, int en) {
        int leftStartIndex = si;
        int rightStartIndex = mid + 1;
        int tempStartIndex = si;
        System.out.println("before temp: ");
        printArray(temp);
        while (leftStartIndex <= mid && rightStartIndex <= en) {
            if (arr[leftStartIndex] < arr[rightStartIndex]) {
                temp[tempStartIndex++] = arr[leftStartIndex++];
            } else {
                temp[tempStartIndex++] = arr[rightStartIndex++];
            }
        }

        while (leftStartIndex <= mid) {
            temp[tempStartIndex++] = arr[leftStartIndex++];
        }

        while (rightStartIndex <= en) {
            temp[tempStartIndex++] = arr[rightStartIndex++];
        }

        System.out.println("After temp: ");
        printArray(temp);

        for (int k = si; k <= en; k++) {
            arr[k] = temp[k];
        }

    }

    static void printArray(int arr[]) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3,2,1,6,7};

        mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}