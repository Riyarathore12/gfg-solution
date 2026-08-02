class Solution {
    public int count(int n, int m) {
        int[] dp = new int[m + 1];

        for (int i = 1; i <= m; i++)
            dp[i] = 1;

        for (int len = 2; len <= n; len++) {
            int[] ndp = new int[m + 1];

            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= m; j++) {
                    if (i % j == 0 || j % i == 0)
                        ndp[i] += dp[j];
                }
            }
            dp = ndp;
        }

        int ans = 0;
        for (int i = 1; i <= m; i++)
            ans += dp[i];

        return ans;
    }
}