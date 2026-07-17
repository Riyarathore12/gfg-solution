class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum = 0;
    int or = n;
        while(n!=0){
            int k =n%10;
            sum += k*k*k;
            n/=10;
        }
        return sum == or;
    }
}