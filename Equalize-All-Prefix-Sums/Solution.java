class Solution {
    public ArrayList<Integer> optimalArray(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        long[] prefix = new long[n];
        prefix[0] = arr[0];

        // Build prefix sum
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Calculate answer for each prefix
        for (int i = 0; i < n; i++) {
            int mid = i / 2;
            long median = arr[mid];

            // Cost for left side
            long leftSum = prefix[mid];
            long leftCost = median * (mid + 1L) - leftSum;

            // Cost for right side
            long rightSum = prefix[i] - prefix[mid];
            long rightCost = rightSum - median * (i - mid);
