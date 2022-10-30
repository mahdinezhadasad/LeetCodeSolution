import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SprialMatrix {

    public static void main(String[] args) {

        int[][] m = generateMatrix(5);
       Arrays.stream(m).map(Arrays::toString).forEach(System.out::println);



    }

    public static int[][] generateMatrix(int n) {

        int[][] result = new int[n][n];
        int cnt = 1;

        for (int layer = 0; layer < (n + 2) / 2; layer++) {

            for (int ptr = layer; ptr < n - layer; ptr++) {

                result[layer][ptr] = cnt++;
            }
            for (int ptr = layer + 1; ptr < n - layer; ptr++) {
                result[ptr][n - layer - 1] = cnt++;
            }
            for (int ptr = layer + 1; ptr < n - layer; ptr++) {
                result[n - layer - 1][n - ptr - 1] = cnt++;
            }
            for (int ptr = layer + 1; ptr < n - layer - 1; ptr++) {
                result[n - ptr - 1][layer] = cnt++;
            }
        }
        return result;
    }
}
