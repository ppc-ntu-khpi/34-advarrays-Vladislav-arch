/**
 * Клас {@code MatrixTest} тестує клас {@code Sum}.
 */
import java.util.Arrays;

public class MatrixTest {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};

        Matrix matrixA = new Matrix() {
            @Override
            public int[][] getMatrix() {
                return a;
            }
        };

        Matrix matrixB = new Matrix() {
            @Override
            public int[][] getMatrix() {
                return b;
            }
        };

        int[][] c = Sum.sum(matrixA.getMatrix(), matrixB.getMatrix());
        System.out.println(Arrays.deepToString(c));
    }
}