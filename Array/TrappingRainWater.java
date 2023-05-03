import java.util.*;

public class TrappingRainWater{

    public static int printTrappingRainWater(int heigth[])
    {
        if(heigth.length<=2) // corner case
            return 0;

        int totalTrappedWater = 0;
        int leftMaxHeight[] = new int[heigth.length];
        int rightMaxHeight[] = new int[heigth.length];

        leftMaxHeight[0] = heigth[0];
        rightMaxHeight[heigth.length-1] = heigth[heigth.length-1];
        
        //Calculating Left max heigth
        for(int i=1; i<leftMaxHeight.length; i++ )
        {
            leftMaxHeight[i] = Math.max(leftMaxHeight[i-1],heigth[i]);
        }
        //Calculating Right max heigth
        for(int j=rightMaxHeight.length-2; j>=0; j--)
        {
            rightMaxHeight[j] = Math.max(rightMaxHeight[j+1],heigth[j]);

        }
        //Calculating trapped rain
        for(int i=0; i<heigth.length; i++)
        {
            int waterLevel = Math.min(leftMaxHeight[i],rightMaxHeight[i]);
            totalTrappedWater = totalTrappedWater+(Math.abs(waterLevel-heigth[i]));
        }

        return totalTrappedWater;
    }
    public static void main(String[] args){
        int heigth[] = {4,2,0,6,3,2,5};
        System.out.println(printTrappingRainWater(heigth)+" units");
        
    }
}