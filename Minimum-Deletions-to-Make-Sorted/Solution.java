        if (n == 0) return 0;

        int[] lis = new int[n];
        int len = 0;

        for (int x : arr) {
            // Find insertion index of x in lis[0...len-1]
            int idx = Arrays.binarySearch(lis, 0, len, x);

            // If x is not found, binarySearch returns (-(insertion point) - 1)
            if (idx < 0) {
                idx = -(idx + 1);
            }

            // Replace or append element
            lis[idx] = x;

            // If idx is at the end of current lis, sequence length increases
            if (idx == len) {
                len++;
            }
        }

        // Minimum deletions = total elements - length of LIS
        return n - len;
    }
}