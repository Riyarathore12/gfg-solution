class Solution {
   
    public int findMaxSum(int arr[]) {
        // code here
        int n = arr.length;
        if(n==0) return 0;
        if(n==1) return arr[0];
        
        int[] dp = new int[n+2];
        for(int i = n-1; i>=0; i--){
            dp[i] = Math.max(arr[i]+dp[i+2], dp[i+1]);
        }
        
        return dp[0];
        
    }
}