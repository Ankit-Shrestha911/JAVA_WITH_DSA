import java.util.*;

public class KadaneAlgorithm{
    //Time O(n) space O(1)
    public static int printKadaneAlgorithm(int arr[])
    {
        int currrentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            currrentSum+=arr[i];

            if(currrentSum<0)
                currrentSum = 0;
            
            if(currrentSum>maxSum)
                maxSum = currrentSum;
        }

        return maxSum;
    }

    public static void main(String[] args){
        int arr[] = {1,-2,6,-1,3};//-2,-3,4,-1,-2,1,5,-3
        System.out.println(printKadaneAlgorithm(arr));
    }
}

/*
    Main point:
    1.positive+postive = postive
    2.positive+small negative = positive
    3.big negative+small postive = negative

    In a kadane algorithm it says don't add if your current sum is negative and assign it zero;
    Negative not contribute to get max sum it just reduce the value.
 */