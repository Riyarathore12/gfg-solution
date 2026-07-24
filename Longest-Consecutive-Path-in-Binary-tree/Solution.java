    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
}*/
class Solution {
    int ans = 1;

    public int longestConsecutive(Node root) {
        dfs(root, Integer.MIN_VALUE, 0);
        return ans == 1 ? -1 : ans;
    }

    void dfs(Node root, int prev, int len) {
        if (root == null)
            return;

        if (root.data == prev + 1)
            len++;
        else
            len = 1;

        ans = Math.max(ans, len);

        dfs(root.left, root.data, len);
        dfs(root.right, root.data, len);
    }
}