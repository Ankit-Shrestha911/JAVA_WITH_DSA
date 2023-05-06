public class letterToUpperCase {

    public static String firstLetterUpperCase(String sentence) {
        StringBuilder newSentence = new StringBuilder("");
        if (sentence.length() == 1)
            return sentence.toUpperCase().toString();

        newSentence.append(sentence.toUpperCase().charAt(0));
        for (int i = 1; i < sentence.length(); i++) {
            if (sentence.charAt(i - 1) == ' ') {
                newSentence.append(sentence.toUpperCase().charAt(i));
            } else
                newSentence.append(sentence.charAt(i));
        }

        return newSentence.toString();

    }

    public static void main(String[] args) {
        String sentence = "hi, i am groot!"; // output:Hi, I Am Groot!
        // String s = "hi";
        System.out.println(firstLetterUpperCase(sentence));

    }

}
