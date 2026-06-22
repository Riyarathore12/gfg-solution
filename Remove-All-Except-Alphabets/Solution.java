class Solution {
    public String removeChars(String s) {
        // code here
        
        StringBuilder sb = new StringBuilder();
        
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                sb.append(ch);
                
            }
        }
        return sb.toString();
    }
}