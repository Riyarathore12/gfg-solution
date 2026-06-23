class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>(); 
        for(int i = 1; i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                if(list.isEmpty() || list.get(list.size()-1 )!=arr[i]){
                    list.add(arr[i]);
                }
            }
        }
        return list;
    }
}