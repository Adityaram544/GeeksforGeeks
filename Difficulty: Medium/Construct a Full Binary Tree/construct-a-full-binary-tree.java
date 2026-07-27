/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    int i;
    HashMap<Integer,Integer> map;
    public Node constructBinaryTree(int[] pre, int[] preMirror) {
        // code here
        i=0;
        map=new HashMap<>();
        for(int i=0;i<preMirror.length;i++){
            map.put(preMirror[i],i);
        }
        return dfs(pre,preMirror,0,preMirror.length-1);
    }
    private Node dfs(int pre[],int preMirror[],int l,int r){
        if(i>=pre.length || l>r) return null;
        Node root=new Node(pre[i++]);
        if(l==r || i>=pre.length) return root;
        int idx=map.get(pre[i]);
        root.left=dfs(pre,preMirror,idx,r);
        root.right=dfs(pre,preMirror,l+1,idx-1);
        return root;
    }
}