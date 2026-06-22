class Solution {
    public int maxArea(List<Integer> height) {
        // code here
        int ans = 0;
        int i = 0;
        int j = height.size()-1;
         while(i<j){
                int width = j-i-1;
                int area = Math.min(height.get(i), height.get(j))* width;
                ans = Math.max(ans , area);
                
                if(height.get(i) < height.get(j)){
            i++;
        }else{
            j--;
        }
        }
       
        return ans;
    }
}