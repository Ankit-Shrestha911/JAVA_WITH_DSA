import java.util.*;

public class MaxSubarray{
    //Method 1:(Brute force)
    public static  int printMaxSubarray(int arr[])
    {
        int maxValue = Integer.MIN_VALUE;
        
        for(int start=0; start<arr.length; start++)
        {
            for(int end=start; end<arr.length; end++)
            {
                int sum = 0;
                for(int k = start; k<=end; k++)
                {
                    sum = sum+arr[k];
                }

                if(sum>maxValue)
                    maxValue = sum;
            }
        }

        return maxValue;
    }

    // Using prefix Array
    public static int printMaxSubarrayOptimize(int arr[])
    {
        int prefixArray[] = new int[arr.length];
        prefixArray[0] = arr[0];

        for(int i=1; i<arr.length; i++)
        {
            prefixArray[i] = prefixArray[i-1]+arr[i];
        }

        int maxValue = Integer.MIN_VALUE;
        
        for(int start=0; start<arr.length; start++)
        {
            int sum = 0;
            for(int end=start; end<arr.length; end++)
            {
                sum = start == 0? prefixArray[end]: prefixArray[end]-prefixArray[start-1];
                if(sum>maxValue)
                    maxValue = sum;
            }
        

    }
        return maxValue;
    }

    public static void main(String[] args){
        int arr[] = {1,-2,6,-1,3};
        //System.out.println(printMaxSubarray(arr));
        System.out.println(printMaxSubarrayOptimize(arr));
    }

}