
        for (int i = 1; i < n; i++) {

            for (int j = 0; j <= k; j++) {

                // previous digit = 0
                dp[i + 1][j][0] =
                    (dp[i + 1][j][0] + dp[i][j][0]) % MOD;

                dp[i + 1][j][1] =
                    (dp[i + 1][j][1] + dp[i][j][0]) % MOD;

                // previous digit = 1
                dp[i + 1][j][0] =
                    (dp[i + 1][j][0] + dp[i][j][1]) % MOD;

                if (j < k)
                    dp[i + 1][j + 1][1] =
                        (dp[i + 1][j + 1][1] + dp[i][j][1]) % MOD;
            }
        }

        return (int)((dp[n][k][0] + dp[n][k][1]) % MOD);
    }
}