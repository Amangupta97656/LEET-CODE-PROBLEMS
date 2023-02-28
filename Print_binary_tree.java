class Solution {
    public int getHeight(TreeNode root){
        if(root == null)
            return 0;
        return 1+Math.max(getHeight(root.left), getHeight(root.right));
    }
    public void setRows(TreeNode root, List<List<String>> ans, int i, int height, int left, int right){
        if(i >= height || root == null) return;
        int mid = (left+right)/2;
        ans.get(i).set(mid, ""+root.val);
        setRows(root.left, ans, i+1, height, left, mid-1);
        setRows(root.right, ans, i+1, height, mid+1, right);
    }
    public List<List<String>> printTree(TreeNode root) {
        int height = getHeight(root);
        List<List<String>> ans = new ArrayList<>();
        int width = (int)Math.pow(2,height)-1;
        List<String> row = new ArrayList<>();
        for(int i=0;i<width;i++)
            row.add("");
        for(int i=0;i<height;i++)
            ans.add(new ArrayList<String>(row));
        setRows(root, ans, 0, height, 0, width-1);
        return ans;
    }
}