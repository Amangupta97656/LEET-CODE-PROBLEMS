class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        //Approach: Using BFS algorithm(Lavel order traversal)
        List<Integer> res = new ArrayList<Integer>();
        Queue<TreeNode> q = new LinkedList<>();
        
        //initialize the queue
        q.add(root);

        //traverse while q is not empty
        while(!q.isEmpty()){
            //initialize the right most element
            TreeNode rightSide = null;
            int size = q.size();

            //go through each element in the level
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                //handle null condition here
                if(node!=null){
                    rightSide = node;
                    //important: add left node in the queue before adding the right node 
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            //handle null condition here
            if(rightSide!=null){
                res.add(rightSide.val);
            }
        }
        return res;
    }
}