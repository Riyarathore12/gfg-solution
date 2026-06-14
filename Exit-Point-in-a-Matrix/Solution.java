        int dir = 0; // 0=Right, 1=Down, 2=Left, 3=Up

        while (true) {

            if (mat[row][col] == 1) {
                dir = (dir + 1) % 4;
                mat[row][col] = 0;
            }

            int nr = row, nc = col;

            if (dir == 0) nc++;
            else if (dir == 1) nr++;
            else if (dir == 2) nc--;
            else nr--;

            if (nr < 0 || nr >= n || nc < 0 || nc >= m) {
                return Arrays.asList(row, col);
            }

            row = nr;
            col = nc;
        }
    }
}