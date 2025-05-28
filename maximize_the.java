public class Solution {
    public static class Dist{
        int val;
        int dist;

        public Dist(int val, int dist){
            this.val = val;
            this.dist = dist;
        }
    }

    public static int[] findTarget(int[] arr, int k, int[][] edges){
        Arrays.fill(arr, 1);
        if(k == 0) return arr;

        ArrayList<ArrayList<Integer>> singleDist = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            singleDist.add(new ArrayList<>());
            boolean[] vis = new boolean[arr.length];
            vis[i] =  true;
            for(int j = 0; j < edges.length; j++){
                int idx = -1 * i;
                if(edges[j][0] == i || edges[j][1] == i){
                    idx += edges[j][0];
                    idx += edges[j][1];
                    if(!vis[idx]){
                        singleDist.get(i).add(idx);
                        vis[idx] = true;
                    }
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            boolean[] vis = new boolean[arr.length];
            vis[i] = true;
            Queue<Dist> q = new LinkedList<>();
            for(int j = 0; j < singleDist.get(i).size(); j++){
                Dist d = new Dist(singleDist.get(i).get(j), 1);
                q.add(d);
            }
            int dis = 1;
            while(arr[i] < arr.length && !q.isEmpty()){
                Dist d = q.remove();
                if (d.dist > k) break;
                if(!vis[d.val]){
                    vis[d.val] = true;
                    arr[i]++;
                    for(int idx = 0; idx < singleDist.get(d.val).size(); idx++){
                        q.add(new Dist(singleDist.get(d.val).get(idx), d.dist + 1));
                    }
                }
            }
        }
        return arr;
    }

    public static int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
        int[] target1 = new int[edges1.length + 1];
        int[] target2 = new int[edges2.length + 1];
        target1 = findTarget(target1, k, edges1);
        if(k == 0){
            return target1;
        }
        target2 = findTarget(target2, k - 1, edges2);
        int maxNum = Integer.MIN_VALUE;
        for(int num: target2){
            maxNum = Math.max(maxNum, num);
        }

        for(int i = 0; i < target1.length; i++){
            target1[i] += maxNum;
        }
        return target1;
    }
}