class Solution {
    public int findSum(String s) {
        // code here
       int num = 0;
       int sum = 0;
       for(char ch : s.toCharArray()){
           if(Character.isDigit(ch)){
               num = num * 10+(ch-'0');
           }else{
               sum += num;
               num =0;
           }
           
       }
       sum += num;
       return sum;
    }
}