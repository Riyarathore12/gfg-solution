class Solution {
    long[][] dp;

    long count(int n, int sum) {
        if (n == 0) {
            return (sum == 0) ? 1 : 0;
        }
        if (sum < 0)
            return 0;

        if (dp[n][sum] != -1)
            return dp[n][sum];

        long ways = 0;

        for (int d = 0; d <= 9; d++) {
            ways += count(n - 1, sum - d);
        }
        return dp[n][sum] = ways;
    }
    public long countWays(int n, int sum) {
        if (sum > 9 * n)
            return -1;

        long ans = 0;

        dp = new long[n + 1][sum + 1];
        for (int i = 0; i <= n; i++)
            java.util.Arrays.fill(dp[i], -1);

        // First digit cannot be 0
        for (int first = 1; first <= 9; first++) {
            if (sum >= first)