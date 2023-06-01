import java.util.*;

public class Largest{

    public static int largestValue(int arr[]){
        if(arr.length == 0) return -1;
        int maxValue = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>maxValue)
                maxValue = arr[i];
        }

        return maxValue;
    }

    public static void main(String[] args){
        int arr[] = {1,11,-1,2,3,300,16,200,121,66};
        int maxValue = largestValue(arr);
        System.out.println(maxValue);

        

    }
}