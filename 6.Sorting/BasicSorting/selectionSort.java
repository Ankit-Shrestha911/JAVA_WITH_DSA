import java.util.*;

public class selectionSort{

    public static void doSelectionSort(int arr[])
    {
        for(int i=0; i<arr.length-1; i++)
        {
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[minIndex]>arr[j])
                {
                   minIndex = j;
                }

            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }

    public static void printArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
        
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {1,3,4,5,2};
        doSelectionSort(arr);
        printArray(arr);
        
    }
}