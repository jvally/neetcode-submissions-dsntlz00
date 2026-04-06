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
    public int goodNodes(TreeNode root) {
        int left = dfs(root.left, root.val);
        int right = dfs(root.right, root.val);
        return 1 + left + right;
    }

    private int dfs(TreeNode root, int maximum){
        if(root == null) return 0;
        if(root.val >= maximum){
            maximum = root.val;
            return 1 + dfs(root.left, maximum) + dfs(root.right, maximum);
        } else{
            return dfs(root.left, maximum) + dfs(root.right, maximum);
        }
    }
}
