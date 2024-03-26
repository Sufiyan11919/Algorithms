package CS545_25th_March;

import java.util.LinkedList;
import java.util.List;

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
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        preorderTraversalRecursive(root, res);
        return res;
    }

    private void preorderTraversalRecursive(TreeNode node, LinkedList<Integer> res) {
        if (node == null)
            return;

        res.add(node.val);
        preorderTraversalRecursive(node.left, res);
        preorderTraversalRecursive(node.right, res);
    }
        
    
}
