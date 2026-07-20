        }
    }

    private String getPrefix(String word) {
        TrieNode curr = root;
        StringBuilder sb = new StringBuilder();

        for (char ch : word.toCharArray()) {
            curr = curr.child[ch - 'a'];
            sb.append(ch);
            if (curr.freq == 1)
                break;
        }

        return sb.toString();
    }

    public ArrayList<String> findPrefixes(String[] arr) {

        for (String word : arr) {
            insert(word);
        }

        ArrayList<String> ans = new ArrayList<>();

        for (String word : arr) {
            ans.add(getPrefix(word));
        }

        return ans;
    }
}