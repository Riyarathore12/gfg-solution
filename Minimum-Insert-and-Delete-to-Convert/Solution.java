            if(map.containsKey(x)) {
                temp.add(map.get(x));
            }
        }

        // LIS using binary search
        ArrayList<Integer> lis = new ArrayList<>();

        for(int x : temp) {
            int idx = Collections.binarySearch(lis, x);

            if(idx < 0)
                idx = -(idx + 1);

            if(idx == lis.size())
                lis.add(x);
            else
                lis.set(idx, x);
        }

        int L = lis.size();

        return (n - L) + (m - L);
    }
}