class Solution {
    int max;

    public int longestPath(int[][] mat, int xs, int ys, int xd, int yd) {
        int n = mat.length;
        int m = mat[0].length;

        if (mat[xs][ys] == 0 || mat[xd][yd] == 0)
            return -1;

        max = -1;
        boolean[][] vis = new boolean[n][m];
        dfs(mat, xs, ys, xd, yd, vis, 0);

        return max;
    }

    void dfs(int[][] mat, int x, int y, int xd, int yd, boolean[][] vis, int len) {
        if (x == xd && y == yd) {
            max = Math.max(max, len);
            return;
        }

        int n = mat.length;
        int m = mat[0].length;

        vis[x][y] = true;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];