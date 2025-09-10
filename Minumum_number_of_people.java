class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int m = languages.length;
        boolean[][] knows = new boolean[m+1][n+1];
        for(int i=0;i<m;i++){
            for(int lang:languages[i]) knows[i+1][lang] = true;
        }
        List<int[]> nonCommunicatingFriendShips = new ArrayList<>();
        for(int[] friend:friendships){
            if(!canCommunicate(friend[0],friend[1],knows)) nonCommunicatingFriendShips.add(friend); 
        }
        int res = m+1;
        for(int i=1;i<=n;i++){
            int cnt = 0;
            boolean[] seen = new boolean[m+1];
            for(int[] friend:nonCommunicatingFriendShips){
                if(!seen[friend[0]] && !knows[friend[0]][i]){
                    cnt++;
                    seen[friend[0]] = true;
                }
                if(!seen[friend[1]] && !knows[friend[1]][i]){
                    cnt++;
                    seen[friend[1]] = true;
                }
            }

            res = Math.min(res,cnt);
        }
        return res;
    }

    private boolean canCommunicate(int f1,int f2,boolean[][] knows){
        for(int i=0;i<knows[f1].length;i++){
            if(knows[f1][i] && knows[f2][i]) return true;
        }

        return false;
    }
}