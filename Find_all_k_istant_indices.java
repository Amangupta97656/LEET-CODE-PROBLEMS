class Solution {
    public List<Integer> findKDistantIndices(int[] a, int key, int k) {
        Set<Integer> s=new HashSet<>();
        for(int j=0;j<a.length; j++){
            if(a[j] == key){
        int l=Math.max(0,j-k);
                int r=Math.min(a.length-1,j+k);
                for (int i=l;i<=r;i++){
                s.add(i);}
            }
        }
        List<Integer> res = new ArrayList<>(s);
        Collections.sort(res);
        return res; 
    }
}