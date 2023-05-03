import java.util.*;

public class bubbleSort{

    public static void doBubbleSort(int arr[])
    {
        //Do some changes to optimize a bit
        for(int i=0; i<arr.length-1; i++)
        {
            boolean isSorted = false;
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j]>arr[j+1])//swap
                {
                    int  temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = true;
                }
            }

            if(!isSorted) break;

        }
    }

    public static void printArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args){
        int arr[] = {4,3,2,1};  
        doBubbleSort(arr);
        printArray(arr);  

    }
}