public class Tiling {

    public static int tilingProblem(int n) {
        if (n == 0 || n == 1)
            return 1;

        // choice either horizontal or vertical
        // vertical
        int verticalChoice = tilingProblem(n - 1);

        // horizontal
        int horizontalChoice = tilingProblem(n - 2);

        return verticalChoice + horizontalChoice;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(5));
    }
}
