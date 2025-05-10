class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long s1=0,s2=0,c1=0,c2=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==0){
                c1++;
            }
            else{
                s1+=nums1[i];
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]==0){
                c2++;
            }
            else{
                s2+=nums2[i];
            }
        }
        if((c1==0&&c2+s2>s1)||(c2==0&&c1+s1>s2)){
            return -1;
        }
        return Math.max(c2+s2,c1+s1);
    }
}