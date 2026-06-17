class Solution {
    static void rotateArr(int arr[], int d) {
        // code here
        int n = arr.length;
        d = d%n;
        int[] arr1 = new int[n];
        for(int i = 0; i<n; i++){
            arr1[i] = arr[(i+d)%n];
            
        }
        for(int i = 0; i<n; i++){
            arr[i] = arr1[i];        }
        
    }
}