class Solution {
    public boolean divisibleByK(int[] arr, int k) {
        // code here
        int n = arr.length;
       if(n> k) return true;
       boolean[] dp = new boolean[k];
       for(int num : arr){
           boolean[] temp = dp.clone();
           
           temp[num%k] = true;
           
           for(int i = 0; i<k; i++){
               if(dp[i]){
                   temp[(i+num)%k] = true;
               }
           }
           dp = temp;
           if(dp[0]) return true;
       }
       return false;
    }
}