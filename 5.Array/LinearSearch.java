import java.util.*;

public class LinearSearch{
    
    public static int findIndex(int arr[], int key)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == key) return i;
        }

        return -1;
    }

    public static void main(String[] args){
        int key = 20;
        int arr[] = {1,2,5,11,6,10,12,17};

        System.out.print(findIndex(arr,key));

    }
}