            return 1;

        int base = a.charAt(a.length() - 1) - '0';

        int exp = 0;
        for (int i = 0; i < b.length(); i++) {
            exp = (exp * 10 + (b.charAt(i) - '0')) % 4;
        }

        if (exp == 0)
            exp = 4;

        int ans = 1;

        while (exp > 0) {
            if ((exp & 1) == 1)
                ans = (ans * base) % 10;

            base = (base * base) % 10;
            exp >>= 1;
        }

        return ans;
    }
}