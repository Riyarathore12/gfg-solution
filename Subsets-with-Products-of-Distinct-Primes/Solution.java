            }
        }

        // Sum up all valid non-empty subset combinations
        long totalSubsets = 0;
        for (int mask = 1; mask < (1 << 10); mask++) {
            totalSubsets = (totalSubsets + dp[mask]) % MOD;
        }

        // Handle '1's: each '1' can either be included or excluded independently
        long onesFactor = power(2, freq[1]);

        return (int) ((totalSubsets * onesFactor) % MOD);
    }

    // Modular exponentiation to calculate (base^exp) % MOD
    private long power(long base, long exp) {
        long result = 1;
        base %= MOD;
        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }
}