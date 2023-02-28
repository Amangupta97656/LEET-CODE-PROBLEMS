class Solution {
   
 public boolean findTarget(TreeNode root, int k) {
  if (root == null) return false;
  Set<Integer> set = new HashSet<>();
  Queue<TreeNode> queue = new LinkedList<>();
  queue.add(root);

  while (!queue.isEmpty()) {

   if (queue.peek() != null) {

    TreeNode node = queue.poll();
    if (set.contains(k - node.val)) return true;

    set.add(node.val);
    queue.add(node.right);
    queue.add(node.left);

   } else {
    queue.remove();
   }
  }

  return false;
 }
}