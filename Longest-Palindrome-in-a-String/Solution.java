            while(l>=0 && r <n && s.charAt(l)==s.charAt(r)){
                int len = r-l+1;
                if(len > maxlen){
                    maxlen = len;
                    start = l;
                }
                l--;
                r++;
            }
            l =i;
            r = i+1;
            while(l >= 0 && r < n && s.charAt(l) == s.charAt(r)){
                int len = r-l+1;
                if(len > maxlen){
                    maxlen = len;
                    start = l;
                }
                l--;
                r++;
                
                
            }
        }
        return s.substring(start , start+maxlen);
    }
}