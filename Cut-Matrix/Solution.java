class Solution {
    static final int MOD = 1_000_000_007;
    
    public int findWays(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        // suf[r][c] = number of 1s in submatrix rows r..n-1, cols c..m-1
        int[][] suf = new int[n + 1][m + 1];
        for (int r = n - 1; r >= 0; r--) {
            for (int c = m - 1; c >= 0; c--) {
                suf[r][c] = matrix[r][c] + suf[r + 1][c] + suf[r][c + 1] - suf[r + 1][c + 1];
            }
        }
        
        // rowSuf[r][c] = sum of matrix[r][c..m-1]  (does row r have a 1 from column c onward?)
        int[][] rowSuf = new int[n][m + 1];
        for (int r = 0; r < n; r++) {
            for (int c = m - 1; c >= 0; c--) {
                rowSuf[r][c] = matrix[r][c] + rowSuf[r][c + 1];
            }
        }
        
        // colSuf[r][c] = sum of matrix[r..n-1][c]  (does column c have a 1 from row r onward?)
        int[][] colSuf = new int[n + 1][m];
        for (int c = 0; c < m; c++) {
            for (int r = n - 1; r >= 0; r--) {
                colSuf[r][c] = matrix[r][c] + colSuf[r + 1][c];