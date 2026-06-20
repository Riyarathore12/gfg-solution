
        int min = Integer.MAX_VALUE;
        int secmin = Integer.MAX_VALUE;

        for (int num : arr) {

            if (num < min) {
                secmin = min;
                min = num;
            }
            else if (num > min && num < secmin) {
                secmin = num;
            }
        }

        if (secmin == Integer.MAX_VALUE) {
            list.add(-1);
        } else {
            list.add(min);
            list.add(secmin);
        }

        return list;
    }
}