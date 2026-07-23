/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    static ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        pre(root, ans);
        return ans;
    }

    static void pre(Node root, ArrayList<Integer> ans) {
        if (root == null)
            return;

        ans.add(root.data);
        pre(root.left, ans);
        pre(root.right, ans);
    }
}