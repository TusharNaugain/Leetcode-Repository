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
    int result = 0;

    public int findTilt(TreeNode root) {
        if (root != null) {
            helper(root);
        }
        return result;
    }

    private int helper(TreeNode root) {
        if (root == null) return 0;

        // Recursive call for left and right children
        int left = (root.left != null) ? helper(root.left) : 0;
        int right = (root.right != null) ? helper(root.right) : 0;

        // Calculate the tilt for the current node and add it to the result
        result += Math.abs(left - right);

        // Return the total sum of the current subtree
        return left + right + root.val;
    }
}
