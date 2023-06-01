public class Duplicate {

    public static String helper(String words, int i, StringBuilder newString, boolean freqChar[]) {
        if (i == words.length())
            return newString.toString();

        if (!freqChar[words.charAt(i) - 'a'])
            newString.append(words.charAt(i));

        freqChar[words.charAt(i) - 'a'] = true;
        helper(words, i + 1, newString, freqChar);

        return newString.toString();
    }

    public static String removeDuplicate(String words, int i) {

        boolean freqChar[] = new boolean[26];
        StringBuilder newString = new StringBuilder("");

        return helper(words, i, newString, freqChar).toString();

    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate("annkkii", 0));
    }
}
