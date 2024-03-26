import java.util.ArrayList;
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorderTrev = new ArrayList<>();
        inorderTraversalRecursive(root, inorderTrev);
        return inorderTrev;
    }

    public void inorderTraversalRecursive(TreeNode node, List<Integer> inorderTrev) {
        if (node == null) {
            return;
        }
        inorderTraversalRecursive(node.left, inorderTrev);
        inorderTrev.add(node.val);
        inorderTraversalRecursive(node.right, inorderTrev);
    }
}