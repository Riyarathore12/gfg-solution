            present[arr[i] - 'a'] = false;

            for (int ch = 0; ch < arr[i] - 'a'; ch++) {

                if (present[ch]) {

                    char c1 = arr[i];
                    char c2 = (char) ('a' + ch);

                    for (int j = 0; j < arr.length; j++) {

                        if (arr[j] == c1)
                            arr[j] = c2;
                        else if (arr[j] == c2)
                            arr[j] = c1;
                    }

                    return new String(arr);
                }
            }
        }

        return s;
    }
}