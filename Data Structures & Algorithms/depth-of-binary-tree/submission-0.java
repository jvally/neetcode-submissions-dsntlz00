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
        int max_depth = 0;
        if(root == null){
            return 0;
        }
        int left = root.left == null? 1 : 1 + maxDepth(root.left);
        int right = root.right == null? 1 : 1 + maxDepth(root.right);
        max_depth = Math.max(left, right);
        return max_depth;
    }
}
