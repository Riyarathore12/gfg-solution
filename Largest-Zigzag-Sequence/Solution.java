
        int[][] dp = new int[n][n];

        for (int j = 0; j < n; j++) {
            dp[0][j] = mat[0][j];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int maxPrev = 0;
                for (int k = 0; k < n; k++) {
                    if (k != j) {
                        maxPrev = Math.max(maxPrev, dp[i - 1][k]);
                    }
                }
                dp[i][j] = mat[i][j] + maxPrev;
            }
        }

        int maxSum = 0;
        for (int j = 0; j < n; j++) {
            maxSum = Math.max(maxSum, dp[n - 1][j]);
        }

        return maxSum;
    }
}