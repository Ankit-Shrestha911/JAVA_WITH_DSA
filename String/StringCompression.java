public class StringCompression {

    public static String getStringCompression(String word) {
        StringBuilder newWord = new StringBuilder("");
        int counter = 1;
        for (int i = 0; i < word.length(); i++) {
            if (i < word.length() - 1 && word.charAt(i) == word.charAt(i + 1)) {
                counter++;
            } else {
                newWord.append(word.charAt(i));

                if (counter > 1)
                    newWord.append(counter);
                counter = 1;
            }
        }

        return newWord.toString();

    }

    public static void main(String[] args) {
        String word = "aaabbbcccdd";
        System.out.println(getStringCompression(word));
    }

}
