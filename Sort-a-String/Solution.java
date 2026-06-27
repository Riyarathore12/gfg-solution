class Solution {
    public String sortString(String s) {
        // code here
        char[] ch = s.toCharArray();
        // for(int i = 0; i<ch.length; i++){
        //     for(int j = 0; j<ch.length-i-1; j++ ){
        //     if(ch[j] > ch[j+1]){
        //         char temp = ch[j];
        //         ch[j] = ch[j+1];
        //         ch[j+1] = temp;
        //     }
        //     }
            
        // }
        Arrays.sort(ch);
        return new String(ch);
    }
}