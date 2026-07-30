            
            // Swap the found element to the current index
            int temp = arr[index];
            arr[index] = arr[maxIdx];
            arr[maxIdx] = temp;
            
            maxIdx = index;
            
            // XOR all other elements that have this bit set
            for (int i = 0; i < arr.length; i++) {
                if (i != maxIdx && (arr[i] & (1 << bit)) != 0) {
                    arr[i] ^= arr[maxIdx];
                }
            }
            
            index++;
        }
        
        // Calculate the maximum XOR sum from the reduced basis elements
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res ^= arr[i];
        }
        
        return res;
    }
}