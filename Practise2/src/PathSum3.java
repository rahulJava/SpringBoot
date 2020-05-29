

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int res = 0;
    public int pathSum(TreeNodee root, int sum) {
        
       
        if(root == null) {
            return 0;
        }
        helper(root, sum);
        if(root.left != null) {
            pathSum(root.left, sum);
        }
        if(root.right != null) {
            pathSum(root.right, sum);
        }
        return res;
    }
    private void helper(TreeNodee root, int sum) {
       
        if(root == null) {
            return;
        }
       
        if(root.val == sum) {
           res++;
            
        }
        if(root.left != null) {
            helper(root.left, sum-root.val);
        }
        if(root.right != null) {
            helper(root.right, sum-root.val);
        }
    }
}