class Solution {
    public static int gcd(int a, int b) {
        // code here
        if(b == 0){
            return a;
        }
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
