/* Structure of Binary Tree Node
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
}*/
class Solution {
    public int longestConsecutive(Node root) {
        // code here
        int res=dfs(root,1);
        return res>1 ? res : -1;
    }
    private int dfs(Node root,int cnt){
        int l=0,r=0;
        if(root.left!=null){
            if((root.left.data)==(root.data)+1){
                l=dfs(root.left,cnt+1);
            }else{
                l=dfs(root.left,1);
            }
        }
        if(root.right!=null){
            if((root.right.data)==(root.data)+1){
                r=dfs(root.right,cnt+1);
            }else{
                r=dfs(root.right,1);
            }
        }
        return Math.max(cnt,Math.max(l,r));
    }
}