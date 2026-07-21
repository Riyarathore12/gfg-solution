class Solution {
    public int maxIndexDifference(String s) {
        int n = s.length();
        int[] dp = new int[n];
        int[][] last = new int[26][];
        
        int[] nextPos = new int[26];
        for (int i = 0; i < 26; i++) nextPos[i] = -1;

        for (int i = n - 1; i >= 0; i--) {
            int c = s.charAt(i) - 'a';

            if (c == 25) {
                dp[i] = i;
            } else {
                int pos = nextPos[c + 1];
                if (pos == -1)
                    dp[i] = i;
                else
                    dp[i] = dp[pos];
            }

            if (nextPos[c] == -1 || dp[i] > dp[nextPos[c]])
                nextPos[c] = i;
        }

        int ans = -1;
        if (nextPos[0] == -1) return -1;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'a')
                ans = Math.max(ans, dp[i] - i);
        }