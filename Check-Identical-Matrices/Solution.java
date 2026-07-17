class Solution {
    public boolean identicalMat(int[][] mat1, int[][] mat2) {
        // code here
        int n = mat1.length;
        int m = mat1[0].length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(mat1[i][j] != mat2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}