import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> largestSquare(int[][] mat, int[][] queries, int k) {
        int n = mat.length;
        int m = mat[0].length;
        
        // Step 1: Build 2D Prefix Sum Array
        int[][] pref = new int[n + 1][m + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                pref[i + 1][j + 1] = mat[i][j] 
                                  + pref[i][j + 1] 
                                  + pref[i + 1][j] 
                                  - pref[i][j];
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        
        // Step 2: Process each query
        for (int[] q : queries) {
            int r = q[0];
            int c = q[1];
            
            int maxRad = Math.min(Math.min(r, n - 1 - r), Math.min(c, m - 1 - c));
            int low = 0, high = maxRad;
            int ansRad = -1;
            
            while (low <= high) {
                int mid = low + (high - low) / 2;
                
                // Define 1-based bounds for the square centered at (r, c) with radius mid