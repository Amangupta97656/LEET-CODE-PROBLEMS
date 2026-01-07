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
    long max = 0;
    long totalSum = 0;
    public int maxProduct(TreeNode root) 
    {
        totalSum = dfs(root);
        traverse(root);
        int mod = 1000000007;
        return (int)(max%mod);
    }
    public long dfs(TreeNode root)
    {
        if(root==null)return 0;
        long leftSum = dfs(root.left);
        long rightSum = dfs(root.right);
        return leftSum+rightSum+root.val;
    }
    public long traverse(TreeNode root)
    {
        if(root==null)return 0;
        long leftSum = traverse(root.left);
        long rightSum = traverse(root.right);
        long s1 = root.val+leftSum+rightSum;
        long s2 = totalSum - s1;
        max = (s1*s2)>max?s1*s2:max;
        return s1;
    }
}