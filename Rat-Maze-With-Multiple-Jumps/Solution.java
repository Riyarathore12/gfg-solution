
        vis[i][j] = true;
        path[i][j] = 1;

        int jump = mat[i][j];

        for (int step = 1; step <= jump; step++) {

            // Right first
            if (dfs(mat, path, vis, bad, i, j + step, n))
                return true;

            // Down second
            if (dfs(mat, path, vis, bad, i + step, j, n))
                return true;
        }

        // Backtrack
        vis[i][j] = false;
        path[i][j] = 0;
        bad[i][j] = true;

        return false;
    }
}