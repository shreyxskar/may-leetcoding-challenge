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
    int res = -1, kk;
    public int kthSmallest(TreeNode root, int k) {        
        if(root == null){
            return 0;
        }
        kk = k;       
        inOrder(root);
        return res;
    }    
    void inOrder(TreeNode root){        
        if(root == null)
            return; 
        inOrder(root.left);
        kk--;
       // System.out.println(root.val+"\tk="+kk+"\tres="+res);       
        if(kk == 0){
            res = root.val;
            return;
        }
        inOrder(root.right);
    }
}
