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
    public TreeNode invertTree(TreeNode root) {
        
        //crash protection
        if(root == null) return null;

        //Swap logic 
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        //we do the same thing for the child as well
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}







