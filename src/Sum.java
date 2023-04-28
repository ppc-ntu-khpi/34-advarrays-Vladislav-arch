/**
 * Клас {@code Sum} містить статичний метод для знаходження суми двох матриць.
 */
public class Sum {

    /**
     * Знаходить суму двох матриць розміром N x M.
     *
     * @param a перша матриця.
     * @param b друга матриця.
     * @return нова матриця, що містить суму a та b.
     * @throws IllegalArgumentException якщо розміри матриць не співпадають.
     */
    public static int[][] sum(int[][] a, int[][] b) {
        int n = a.length;
        int m = a[0].length;
        if (n != b.length || m != b[0].length) {
            throw new IllegalArgumentException("Неправильні розміри матриць");
        }
        int[][] c = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
}