class Solution {
    int maxPeopleDefeated(int p) {
        // code here
        long low = 0;
        long high = 2000000; 
        long ans = 0;
        while(low <= high){
            long mid  = low+ (high - low)/2;
            
            long sum = mid*(mid+1)*(2*mid+1)/6;
            if(sum <= p){
                ans = mid;
                low = mid+1;
            }else{
            high = mid-1;
            }
        }
        return (int) ans;
    }
}