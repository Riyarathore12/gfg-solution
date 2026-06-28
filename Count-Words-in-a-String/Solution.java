class Solution {
    public int countWords(String s) {
        // code here
        s = s.trim();
        if(s.length() == 0){
            return 0;
        }
        String[] words = s.split("[ \n\t]+");
        return words.length;
    }
}