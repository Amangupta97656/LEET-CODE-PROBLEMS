class Solution {
    Map<TreeNode, TreeNode> map;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        map = new HashMap<>();
        q.add(root);
        TreeNode first = null, last = null;
        while(!q.isEmpty()) {
            int size = q.size();
            first = q.peekFirst();
            last = q.peekLast();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.pollFirst();
                if (curr.left != null) {
                    q.add(curr.left);
                    map.put(curr.left, curr);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                    map.put(curr.right, curr);
                }
            }
        }
        return findlca(root, first, last);
    }

    TreeNode findlca(TreeNode root, TreeNode a, TreeNode b) {
        TreeNode curr1 = a, curr2 = b;
        while (curr1 != curr2) {
            curr1 = map.get(curr1);
            curr2 = map.get(curr2);
            if (curr1 == null) curr1 = b;
            if (curr2 == null) curr2 = a;
        }
        return curr1;
    }
}