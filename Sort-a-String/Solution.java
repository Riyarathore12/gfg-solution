        //     if(ch[j] > ch[j+1]){
        //         char temp = ch[j];
        //         ch[j] = ch[j+1];
        //         ch[j+1] = temp;
        //     }
        //     }
            
        // }
        // Arrays.sort(ch);
        // return new String(ch);
        int[] freq  = new int[26];
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            freq[c -'a']++;
        }
            for(int i = 0; i<26; i++){
                
                while(freq[i]-- > 0){
                    sb.append((char)(i+'a'));
                
            }
        }
        return sb.toString();
    }
}