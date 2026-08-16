    static void relativeSort(int[] a1, int[] a2) {
        // code here
        int maxval = 0;
        for(int num : a1){
            maxval = Math.max(maxval , num);
        }
        int[] freq = new int[maxval+1];
        for(int num : a1){
            freq[num]++;
        }
        int index = 0;
        for(int num : a2){
            if(num <= maxval && freq[num]>0){
                while(freq[num]>0){
                    a1[index++]= num;
                    freq[num]--;
                }
            }
        }
        for(int i = 0; i<= maxval; i++){
            while(freq[i]>0){
                a1[index++]= i;
                freq[i]--;
            }
        }
    }
}