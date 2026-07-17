class Solution {
    public int maxDiffSubArrays(int[] arr) {
        int n = arr.length;

        int[] leftMax = new int[n];
        int[] leftMin = new int[n];
        int[] rightMax = new int[n];
        int[] rightMin = new int[n];

        // Left Max
        int curr = arr[0];
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            leftMax[i] = Math.max(leftMax[i - 1], curr);
        }

        // Left Min
        curr = arr[0];
        leftMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            curr = Math.min(arr[i], curr + arr[i]);
            leftMin[i] = Math.min(leftMin[i - 1], curr);
        }

        // Right Max
        curr = arr[n - 1];
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            curr = Math.max(arr[i], curr + arr[i]);
            rightMax[i] = Math.max(rightMax[i + 1], curr);
        }
