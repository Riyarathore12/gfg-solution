class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        HashSet< Integer> set =new HashSet<>();
        for(int num : arr){
            if(!set.contains(num)){
                set.add(num);
                list.add(num);
            }
        }
        return list;
    }
}