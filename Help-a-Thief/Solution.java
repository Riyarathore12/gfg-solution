        int[][] boxes = new int[N][2];

        // Store plates and coins
        for (int i = 0; i < N; i++) {
            boxes[i][0] = A[i]; // Number of plates
            boxes[i][1] = B[i]; // Coins per plate
        }

        // Sort by coins per plate in descending order
        Arrays.sort(boxes, (a, b) -> b[1] - a[1]);

        int ans = 0;

        for (int i = 0; i < N && T > 0; i++) {

            int take = Math.min(T, boxes[i][0]);

            ans += take * boxes[i][1];

            T -= take;
        }

        return ans;
    }
}