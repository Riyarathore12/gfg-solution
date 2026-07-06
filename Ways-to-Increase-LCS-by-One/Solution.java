                    suf[i][j] = suf[i + 1][j + 1] + 1;
                else
                    suf[i][j] = Math.max(suf[i + 1][j], suf[i][j + 1]);
            }
        }

        int ans = 0;

        for (int pos = 0; pos <= n; pos++) {
            boolean[] used = new boolean[26];

            for (int j = 0; j < m; j++) {
                int ch = s2.charAt(j) - 'a';

                if (!used[ch] &&
                    pre[pos][j] + 1 + suf[pos][j + 1] == L + 1) {
                    used[ch] = true;
                    ans++;
                }
            }
        }

        return ans;
    }
}