import java.util.*;

class Solution {
    public int largestArea(int n, int m, int k, int[][] arr) {

        int[] rows = new int[k];
        int[] cols = new int[k];

        for (int i = 0; i < k; i++) {
            rows[i] = arr[i][0];
            cols[i] = arr[i][1];
        }

        Arrays.sort(rows);
        Arrays.sort(cols);

        int maxRow = 0;
        int prev = 0;

        // Find largest gap between blocked rows
        for (int r : rows) {
            maxRow = Math.max(maxRow, r - prev - 1);
            prev = r;
        }

        maxRow = Math.max(maxRow, n - prev);

        int maxCol = 0;
        prev = 0;

        // Find largest gap between blocked columns
        for (int c : cols) {
            maxCol = Math.max(maxCol, c - prev - 1);