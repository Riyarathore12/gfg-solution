class Solution {
    public int maxSumSubarray(int[] arr) {
        int n = arr.length;

        int noDelete = arr[0];      // maximum ending here without deletion
        int oneDelete = 0;          // maximum ending here with one deletion
        int ans = arr[0];

        for (int i = 1; i < n; i++) {
            int newOneDelete = Math.max(oneDelete + arr[i], noDelete);
            int newNoDelete = Math.max(arr[i], noDelete + arr[i]);

            oneDelete = newOneDelete;
            noDelete = newNoDelete;

            ans = Math.max(ans, Math.max(noDelete, oneDelete));
        }

        return ans;
    }
}