class Solution {
    static final long MOD = 1000000007L;

    static long power(long a, long b) {
        long res = 1;

        while (b > 0) {
            if ((b & 1) == 1)
                res = (res * a) % MOD;

            a = (a * a) % MOD;
            b >>= 1;
        }

        return res;
    }

    static int computeValue(int n) {
        int N = 2 * n;

        long[] fact = new long[N + 1];