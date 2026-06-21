class Solution {
    public void Addition(int[][] matrixA, int[][] matrixB) {
        // code 
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                matrixA[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        
    }
}