public class Occurence {

    public static int firstOccurence(int arr[], int i, int key) {
        if (i == arr.length - 1)
            return -1;

        if (arr[i] == key)
            return i;

        return firstOccurence(arr, i + 1, key);
    }

    public static int lastOccurence(int arr[], int n, int key) {
        if (n == 1 && arr[n] != key)
            return -1;

        if (arr[n] == key)
            return n;

        return lastOccurence(arr, n - 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 5, 8, 3 };
        System.out.println(firstOccurence(arr, 0, 5));
        System.out.println(lastOccurence(arr, arr.length-1, 5));
        System.out.println(arr.length);

    }
}
