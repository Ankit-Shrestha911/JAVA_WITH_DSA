public class BinaryString {

    public static void binaryString1(int n, int lastPlace, StringBuilder ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }

        binaryString1(n - 1, 0, ans.append("0"));
        ans.deleteCharAt(ans.length() - 1);

        if (lastPlace == 0) {
            binaryString1(n - 1, 1, ans.append("1"));
            ans.deleteCharAt(ans.length() - 1);
        }
    }

    public static void binaryString2(int n, int lastPlace, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        System.out.println(lastPlace);
        binaryString2(n - 1, 0, ans + "0");

        if (lastPlace == 0) {
            binaryString2(n - 1, 1, ans + "1");

        }
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        binaryString2(3, 1, "");

    }
}
