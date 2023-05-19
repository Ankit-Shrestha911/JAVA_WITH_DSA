public class SortedRotated {

    static int sortedAndRotated(int arr[], int si, int en, int key) {

        if (si > en)
            return -1;

        int mid = (si + en) / 2;
        // found
        if (arr[mid] == key) {
            return mid;
        }

        // L1
        if (arr[si] <= arr[mid]) {
            // left
            if (arr[si] <= key && key <= arr[mid]) {
                return sortedAndRotated(arr, si, mid - 1, key);
            } else {
                // right
                return sortedAndRotated(arr, mid + 1, en, key);
            }
        }

        // L2

        else {
            if (arr[mid] <= key && key <= arr[en]) {
                //right
                return sortedAndRotated(arr, mid + 1, en, key);
            } else {
                //left
                return sortedAndRotated(arr, si, mid - 1, key);
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        System.out.println(sortedAndRotated(arr, 0, arr.length - 1, 6));
    }
}
