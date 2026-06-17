class Solution {
    String equilibrium(int arr[]) {
        // code here
        int n  = arr.length;
        int totalsum = 0;
        for(int num : arr){
            totalsum += num;
        }
        int leftsum = 0;
        for(int i = 0; i<arr.length; i++){
            int rightsum = totalsum - leftsum -arr[i];
            if(leftsum == rightsum){
                return "true";
            }
            leftsum += arr[i];
        }
        return "false";
        
    }
    
}