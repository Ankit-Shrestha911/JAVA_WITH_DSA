public class Permutation {

    static void printPermutation(String input, String output) {
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }

        for (int j = 0; j < input.length(); j++) {
            printPermutation(input.substring(0, j) + input.substring(j + 1), output + input.charAt(j));
        }
    }

    // static void printPermutation2(StringBuilder input, StringBuilder output) {
    //     if (input.length() == 0) {
    //         System.out.println(output.toString());
    //         return;
    //     }

    //     for (int j = 0; j < input.length(); j++) {
    //         printPermutation2(input.append(input.substring(0, j)).append(input.substring(j+1)), output.append(input.charAt(j)));
    //     }
    // }


    public static void main(String[] args) {
        // printPermutation2(new StringBuilder("abc"), new StringBuilder(""));

        StringBuilder b = new StringBuilder("abcde");

       

        System.out.println(b);

    }
}
