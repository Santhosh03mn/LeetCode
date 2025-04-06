class Solution {
    public void rotate(int[][] matrix) {
        int l = matrix.length;
        int[][] a = new int[l][l];
        int r = 0, c = 0;
        for (int i = 0; i < l; i++) {
            for (int j = l - 1; j >= 0; j--) {
                a[r][c] = matrix[j][i];
                c++;
            }
            r++;
            c = 0;
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                matrix[i][j] = a[i][j];
            }
        }
    }
}