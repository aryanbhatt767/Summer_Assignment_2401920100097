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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean lefttoright = true;
        List<List<Integer>> li = new ArrayList<>();

        if (root == null) return li;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode top = q.poll();

                temp.add(top.val);

                if (top.left != null) q.add(top.left);
                if (top.right != null) q.add(top.right);
            }

            if (!lefttoright) {
                Collections.reverse(temp); 
            }

            li.add(temp);
            lefttoright = !lefttoright; 
        }

        return li;
        
    }
}