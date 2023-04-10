
class Solution {
    public TreeNode createBST(int arr[],int st,int end){
        int mid=(st+end)/2;
        if(st>end) return null;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=createBST(arr,st,mid-1);
        root.right=createBST(arr,mid+1,end);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        TreeNode root=createBST(nums,0,n-1);
        return root;
        
    }
}