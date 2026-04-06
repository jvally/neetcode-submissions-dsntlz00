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
    public List<List<Integer>> levelOrder(TreeNode root) {
        //bfs solution: use the queue add the nodes at each level 
        //and make a new list every level
        if(root == null){
            return new ArrayList<>() ;
        }

        Queue<TreeNode> q = new LinkedList<>();//set up q
        List<List<Integer>> res = new ArrayList<>();//res array

        q.offer(root);

        while(!q.isEmpty()){
            int n = q.size();//at each level need to add 2^n node
            List<Integer> level = new ArrayList<>();

            for(int i = 0;i < n;i++){
                TreeNode node = q.poll();
                level.add(node.val);
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);

            }   
            if(level.size() > 0)res.add(level);

        }
        return res;
    }
}
