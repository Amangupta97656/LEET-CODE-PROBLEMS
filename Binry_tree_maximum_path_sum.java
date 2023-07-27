class Solution {
    private int maxPath = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if(root.left == null && root.right == null) return root.val;
        helper(root);
        return maxPath;
    }

    private int helper(TreeNode node) {
        if(node == null) return 0;

        int left = Math.max(0, helper(node.left));
        int right = Math.max(0, helper(node.right));
        
        maxPath = Math.max(node.val + left + right, maxPath);
        return node.val + Math.max(left, right);
    }
}