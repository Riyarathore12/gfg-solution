                sum2 += b[j];
                j++;
            }
            else {
                ans += Math.max(sum1, sum2) + a[i];

                sum1 = 0;
                sum2 = 0;

                i++;
                j++;
            }
        }

        while (i < a.length)
            sum1 += a[i++];

        while (j < b.length)
            sum2 += b[j++];

        ans += Math.max(sum1, sum2);

        return ans;
    }
}