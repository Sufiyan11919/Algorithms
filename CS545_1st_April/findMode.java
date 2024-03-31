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
    public int[] findMode(TreeNode root) {
        if (root == null)
            return new int[0];
        // list to store node values in ascending order
        LinkedList<Integer> nodeList = new LinkedList<>();
        // queue for BFS traversal
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        // BFS traversal and insertion
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            insertSorted(nodeList, current.val);
            if (current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
        }
        // Find node with max freq
        List<Integer> modes = new ArrayList<>();
        int maxFreq = 0;
        int currentFreq = 0;
        int prev = Integer.MIN_VALUE;
        for (int val : nodeList) {
            if (val != prev) {
                currentFreq = 1;
            } else {
                currentFreq++;
            }
            if (currentFreq > maxFreq) {
                modes.clear();
                modes.add(val);
                maxFreq = currentFreq;
            } else if (currentFreq == maxFreq) {
                modes.add(val);
            }
            prev = val;
        }

        // Convert List<Integer> to int[] return type
        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }
        return result;
    }
    // Helper method to insert a value in sorted linked list
    private void insertSorted(LinkedList<Integer> list, int val) {
        int index = 0;
        while (index < list.size() && val > list.get(index)) {
            index++;
        }
        list.add(index, val);
    }
}