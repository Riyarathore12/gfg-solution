class Solution {
    public int convertFive(int n) {
        // code here
        if(n==0){
            return 5;
        }
        String str =  String.valueOf(n);
        str = str.replace('0','5');
        return Integer.parseInt(str);
    }
}