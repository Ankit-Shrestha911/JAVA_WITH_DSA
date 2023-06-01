
public class StringBuilderIntro {

    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("");

        for (char i = 'a'; i <= 'z'; i++)
            name.append(i);

        System.out.println(name);
        System.out.println(name.length());

    }

}

/*
 * In a normal String what happen is everytime when you modified. The original
 * one is leavse as it is but it
 * create new string in String pool area and refernce this to your variable.
 * This is not efficient because everytime it copy the whole character of string
 * to the new one;
 * 
 * Using this: String sc = new String("hello").inter();
 * 
 * what intern() does is if "hello" string already exist in the [string pool]
 * area it doesn't create a object
 * on the heap it simply refer that one.
 * 
 * Here StringBuilder came in the picture to fix all the thing that are not
 * efficient of String.
 * In a StringBuilder it create once and modified happen in the same one you
 * create.
 */
