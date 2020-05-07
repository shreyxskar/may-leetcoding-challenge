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
    int dx = -1, dy = -1, px = 0, py = 0;
    public boolean isCousins(TreeNode root, int x, int y) {
        getParentAndLevel(root, x, y, 0);        
        return dx==dy && px!=py;
    }
    void getParentAndLevel(TreeNode root, int x, int y, int d){
        if(root==null)
            return;
        if(root.left != null){
            if(root.left.val == x){
                dx = d + 1;
                px = root.val;
            }else if(root.left.val == y){
                dy = d + 1;
                py = root.val;
            }
        }
        if(root.right != null){
            if(root.right.val == x){
                dx = d + 1;
                px = root.val;
            }else if(root.right.val == y){
                dy = d + 1;
                py = root.val;
            }
        }
        if(dx!=-1 && dy!=-1)
            return;
        getParentAndLevel(root.left, x, y, d+1);
        getParentAndLevel(root.right, x, y, d+1);
    }
}
