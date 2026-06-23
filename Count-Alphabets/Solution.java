class Solution {
    static int Count(String S) {
        // code here
        int count = 0;
        for(char ch : S.toCharArray()){
            if(Character.isLetter(ch)){
                count++;
            }
        }
        return count;
    }
}