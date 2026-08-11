                // Define 1-based bounds for the square centered at (r, c) with radius mid
                int r1 = r - mid + 1;
                int c1 = c - mid + 1;
                int r2 = r + mid + 1;
                int c2 = c + mid + 1;
                
                // Calculate 1s in O(1)
                int ones = pref[r2][c2] - pref[r1 - 1][c2] - pref[r2][c1 - 1] + pref[r1 - 1][c1 - 1];
                
                if (ones <= k) {
                    ansRad = mid;
                    low = mid + 1; // Try to expand further
                } else {
                    high = mid - 1; // Reduce size
                }
            }
            
            if (ansRad == -1) {
                result.add(-1);
            } else {
                result.add(2 * ansRad + 1);
            }
        }
        
        return result;
    }
}