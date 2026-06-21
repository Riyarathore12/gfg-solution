class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
       
        int n = arr.length;
        int[] freq = new int[n+1];
        for(int num : arr){
            if(num >= 1 && num <=n){
                freq[num]++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1;i<=n; i++){
            list.add(freq[i]);
        }
        return list;
    }
}
