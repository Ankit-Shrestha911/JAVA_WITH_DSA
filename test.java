import java.lang.reflect.Array;
import java.util.*;

public class test{

    static int partition(ArrayList<Integer>list, int s, int e) {
        int pivotPoint = list.get(e);
        int i = s-1;

        for(int j=s; j<e; j++) {
            if(list.get(j)<=pivotPoint) {
                //swap
                i++;
                int temp = list.get(j);
                list.set(j, list.get(i));
                list.set(i, temp);

            }
        }

        i++;
        int temp = pivotPoint;
        list.set(e, list.get(i));
        list.set(i,temp);

        return i;

    }

    static void quickSort(ArrayList<Integer>list, int s, int e) {
        if(s>=e) return;

        int pivotPoint = partition(list,s,e);
        quickSort(list, s, pivotPoint-1);
        quickSort(list, pivotPoint+1, e);
    }

    public static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(12,0,1,-1,2,6,7));  
        System.out.println(list);
        quickSort(list, 0, list.size()-1);
        System.out.println(list);  
    }


}