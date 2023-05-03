import java.util.*;

public class KadaneAlgorithm{

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