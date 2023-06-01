import java.util.*;

public class binarySearch{

    public static int getbinarySearch(int arr[], int key){

        int startIndex = 0;
        int lastIndex = arr.length-1;
        while(startIndex<=lastIndex)
        {
            int mid = (startIndex+lastIndex)/2;
            if(arr[mid] == key)
                return mid;
            else if(arr[mid]>key)
                lastIndex = mid-1;
            else
                startIndex = mid+1;
        }

        return -1;
        
    }

    public static void main(String[] args){
        int arr[] = {-1,0,1,2,3,6,10,11};
        int index = getbinarySearch(arr,11);
        System.out.println("The value of " +arr[index]+" in index: "+index);

        
    }
}