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
 * https://leetcode.com/problems/validate-binary-search-tree/
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isbst(root,null,null);
    }
    
    public static boolean isbst(TreeNode root,TreeNode l,TreeNode r)
    {
        if(root==null)
        {
            return true;
        }
        else if(l!=null && root.val<=l.val)
        {
            return false;
        }
        else if(r!=null && root.val>=r.val)
        {
            return false;
        }
        
        return (isbst(root.left,l,root) && isbst(root.right,root,r));
    }
}