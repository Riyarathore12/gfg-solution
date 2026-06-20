class Solution {
    String removeVowels(String s) {
        // code here
        int n= s.length();
       StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i++){
            char ch  = Character.toLowerCase(s.charAt(i));
            if(ch != 'a'&&  ch != 'e'&& ch != 'o' && ch != 'u'&& ch != 'i'){
                sb.append(s.charAt(i));
                
            }
            
        }
        return sb.toString();
    }
}