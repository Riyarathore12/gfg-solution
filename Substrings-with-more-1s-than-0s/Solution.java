
        for (int i = 1; i <= n; i++) {
            pre[i] = pre[i - 1]
                    + (s.charAt(i - 1) == '1' ? 1 : -1);
        }

        int[] temp = pre.clone();
        Arrays.sort(temp);

        HashMap<Integer,Integer> map = new HashMap<>();
        int idx = 1;

        for (int x : temp) {
            if (!map.containsKey(x))
                map.put(x, idx++);
        }

        BIT bit = new BIT(idx + 2);

        long ans = 0;

        for (int x : pre) {
            int pos = map.get(x);

            ans += bit.query(pos - 1);

            bit.update(pos, 1);
        }

        return (int) ans;
    }
}