import java.util.*;

public class ArrayListIntro{

    public static void main(String[] args){
        ArrayList<Integer>intData = new ArrayList<>(); // Initialize
        ArrayList<String>stringData = new ArrayList<>(); // Initialize
        ArrayList<Float>floatData = new ArrayList<>(); // Initialize
        ArrayList<Character>charData = new ArrayList<>(); // Initialize
        ArrayList<Boolean>booleanData = new ArrayList<>(); // Initialize


        intData.add(1);
        intData.add(2);
        intData.add(3);
        stringData.add("Data");
        floatData.add(3.4f);
        charData.add('a');
        booleanData.add(true);
        intData.set(1, 10);
        System.out.println(intData.get(1));
        System.out.println(booleanData);
        System.out.println(floatData);
        
    }
}