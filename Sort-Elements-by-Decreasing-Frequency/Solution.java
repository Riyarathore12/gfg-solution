class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        int n = arr.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num , map.getOrDefault(num , 0)+1);
            
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr){
            list.add(num);
            
        }
        Collections.sort(list , (a, b) ->
        {
            if(map.get(a).equals(map.get(b))){
                return a-b;
            }
            return map.get(b)- map.get(a);
            });
        return list;
    }
}