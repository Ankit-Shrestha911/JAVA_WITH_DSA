public class insertionSort{
    
    public static void doInsertionSort(int arr[]){
        
        for(int i=1; i<arr.length; i++)
        {
            int current = arr[i];
            int previous = i-1;
            
            //Find out right position
            while(previous>=0 && arr[previous]>current)
            {
                arr[previous+1] = arr[previous];
                previous--;
            }
            
            //Insert into right position
            arr[previous+1] = current;
        }
    }
    
    public static void printArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");

        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {5,1,3,4,2};
        doInsertionSort(arr);
        printArray(arr);
    }
}
