class Solution {
    String encryptString(String s) {
        // code here
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 1; i<n; i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }else{
                sb.append(s.charAt(i-1));
                sb.append(count);
                count = 1;
            }
        }
        sb.append(s.charAt(n-1));
        sb.append(count);
       
        
         return sb.reverse().toString();
    }
}