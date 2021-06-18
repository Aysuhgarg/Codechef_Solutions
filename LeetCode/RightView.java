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
 * Link--------->https://leetcode.com/problems/binary-tree-right-side-view/submissions/
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> lot =levelOrder(root);
        
        //List<Integer>ans=new ArrayList<>();
        
        //for()
        return lot;
    }
    
     public List<Integer> levelOrder(TreeNode root) {
        
        if(root==null)
        {
            return new ArrayList<>();
        }
        TreeNode s=new TreeNode(Integer.MAX_VALUE);
        ArrayDeque<TreeNode> q=new ArrayDeque<>();
        //boolean vist[]=new boolean[]
        q.add(s);
        q.add(root);
        ArrayList<Integer> al=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        while(q.size()>0)
        {
            TreeNode top=q.remove();
            if(top==s)
            {
                if(q.size()>0){
                q.add(s);}
                if(al.size()>0)
                {
                    //ans.add(al);
                    ans.add(al.get(al.size()-1));
                    al=new ArrayList<>();
                }
            }
            else
            {
                al.add(top.val);
                
                if(top.left!=null) q.add(top.left);
                if(top.right!=null) q.add(top.right);
                
            }
        }
        
        return ans;
    }
}