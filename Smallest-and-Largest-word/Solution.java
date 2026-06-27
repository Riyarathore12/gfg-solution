class Solution {
    public ArrayList<String> smallerAndLarge(String s) {
        // code here
        ArrayList<String> list = new ArrayList<>();
        
        String[] words = s.split("\\s+");
        String small = words[0];
        String largest = words[0];
        
        for(String word : words){
            if(word.length() < small.length()){
                small = word;
            }
            if(word.length() >= largest.length()){
            largest = word;
            }
            
        }
        list.add(small);
        list.add(largest);
        return list;
    }
}