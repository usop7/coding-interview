public class Array7 {

    public static int[][] rotateMatrix(int[][] m) {
        int[][] result = new int[4][4];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                result[i][j] = m[m.length - 1 - j][i];
            }
        }
        return result;
    }

    public static void printArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = {
            {1, 1, 1, 1},
            {0, 2, 2, 2},
            {0, 0, 3, 3},
            {0, 0, 0, 4}
        };
        printArray(array);

        System.out.println();

        printArray(rotateMatrix(array));
    }
}