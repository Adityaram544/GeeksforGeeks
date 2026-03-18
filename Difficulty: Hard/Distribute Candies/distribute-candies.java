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
    int cnt=0;
    public int distCandy(Node root) {
        // code here
        dfs(root);
        return cnt;
    }
    private int dfs(Node root) {
        if(root == null) return 0;

        int left = dfs(root.left);
        int right = dfs(root.right);

        cnt += Math.abs(left) + Math.abs(right);

        return root.data - 1 + left + right;
    }
}