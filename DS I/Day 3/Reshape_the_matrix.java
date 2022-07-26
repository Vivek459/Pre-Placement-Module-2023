class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
      int row = mat.length;
        if (row == 0) {
            return mat;
        }
        int col = mat[0].length;
        if (col == 0) {
            return mat;
        }
        int newSize = r * c;
        int currentSize = row * col;
        if (newSize != currentSize) {
            return mat;
        }
        int[][] result = new int[r][c];
        int k = 0;
        int l = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = mat [k][l];
                if (l == col - 1) {
                    k++;
                }
                l = (l + 1) % col;
            }
        }
        return result;
    }
}