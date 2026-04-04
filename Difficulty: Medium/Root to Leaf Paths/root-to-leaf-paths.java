/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> path=new ArrayList<>();
        if(root==null) return res;
        helper(root,res,path);
        return res;
    }
    private static void helper(Node root,ArrayList<ArrayList<Integer>> res,
        ArrayList<Integer> path){
        if(root.left==null && root.right==null){
            path.add(root.data);
            res.add(new ArrayList<>(path));
            path.remove(path.size()-1);
            return;
        }
        path.add(root.data);
        if(root.left!=null){
            helper(root.left,res,path);
        }
        if(root.right!=null){
            helper(root.right,res,path);
        }
        path.remove(path.size()-1);
    }
}