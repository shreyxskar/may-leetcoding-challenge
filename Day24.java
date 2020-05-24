/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode root = null, res = null;
    public TreeNode bstFromPreorder(int[] preorder) {
        for(int v: preorder){
            res = addNode(res, v);
        }
        return res;
    }
    public TreeNode addNode(TreeNode root, int v){
        if(root == null){
            root = new TreeNode(v, null, null); 
            return root;
        }
        if(root.val > v)
            root.left = addNode(root.left, v);
        else
           root.right = addNode(root.right, v);
        return root;
    }
}
