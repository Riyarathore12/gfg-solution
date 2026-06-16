class Solution {
    public ArrayList<Integer> constructList(int[][] queries) {
        // code 
       ArrayList<Integer> list = new ArrayList<>();
        int xorval = 0;
        list.add(0);
        
        for(int  i =0; i<queries.length; i++){
            int type = queries[i][0];
            int x = queries[i][1];
            if(type ==0){
                list.add(x^xorval);
            }else{
                xorval ^=x;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int val : list){
            ans.add(val^ xorval);
        }
        Collections.sort(ans);
        
        return ans;
    }}