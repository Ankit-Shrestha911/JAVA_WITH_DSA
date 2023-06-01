public class Subsets {

    static void printSubsets(String input, int i, String output) {
        if (i == input.length()) {
            System.out.println(output);
            return;
        }

        // Not part of output
        printSubsets(input, i + 1, output);

        // Part of output
        printSubsets(input, i + 1, output + input.charAt(i));
    }

    static void printSubsets2(String input, int i, StringBuilder output) {
        if (i == input.length()) {
            System.out.println(output);
            return;
        }

        // Exclude
        printSubsets2(input, i + 1, output);

        // Include
        printSubsets2(input, i + 1, output.append(input.charAt(i)));

        output.deleteCharAt(output.length() - 1);

    }

    public static void main(String[] args) {
        // printSubsets("ab", 0, "");
        printSubsets2("ab", 0, new StringBuilder(""));

    
    }    
}
