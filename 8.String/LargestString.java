import java.util.*;

public class LargestString{

    public static String getLargestString(String fruits[])
    {
        String largestString = fruits[0];

        for(int i=1; i<fruits.length; i++)
        {
            if(largestString.compareToIgnoreCase(fruits[i]) < 0)
            {
                largestString = fruits[i];
            }
        }

        return largestString;

    }

    public static void main(String[] args){
        String fruits[] = {"apple","mango","banana"};    
        System.out.println(getLargestString(fruits));
    }
}