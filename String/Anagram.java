public class Anagram {
    public static boolean anagram(String word1, String word2) {
        int freq1[] = new int[26];
        int freq2[] = new int[26];

        if (word1.length() != word2.length())
            return false;

        for (int i = 0; i < word1.length(); i++) {
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);
            freq1[ch1 - 'a']++;
            freq2[ch2 - 'a']++;
        }

        for (int i = 0; i < 26; i++) {

            if (freq1[i] != freq2[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silenn";

        System.out.println(anagram(word1, word2));
  

    }

}

/*
 * Anagram means you have to rearranging the letter of another word using all
 * the orignal
 * letter at once.
 * Example: race and care
 * Here i can make care using the letter of race and vice-versa
 */
