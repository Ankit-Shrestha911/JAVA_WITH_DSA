import java.util.*;

public class Palindrome {

    public static boolean checkPalindrome(String words) {
        int size = words.length();
        if (words.length() == 1)
            return true;

        for (int i = 0; i < words.length() / 2; i++) {
            if (words.charAt(i) != words.charAt(size-i-1))
                return false;
      
        }

        return true;
    }

    public static void main(String[] args) {
        String words = "racecar";
        System.out.println(checkPalindrome(words));


    }
}