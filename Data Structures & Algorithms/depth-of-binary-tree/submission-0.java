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
    public int maxDepth(TreeNode root) {

        //crash guard 
        if(root == null) return 0;

        int maxRight = maxDepth(root.left);
        int maxLeft = maxDepth(root.right);

        int result = 1 + Math.max(maxLeft, maxRight);
    
        return result;
    }
}
