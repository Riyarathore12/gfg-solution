import java.util.Arrays;

class Solution {
    public static int countPairs(int arr[], int k) {
        Arrays.sort(arr);
        int count = 0;
        int j = 0;
        
        for (int i = 0; i < arr.length; i++) {
            // Expand pointer j as long as the difference is strictly less than k
            while (j < arr.length && arr[j] - arr[i] < k) {
                j++;
            }
            // All elements from index (i + 1) to (j - 1) form valid pairs with arr[i]
            count += (j - 1 - i);
        }
        
        return count;
    }
}