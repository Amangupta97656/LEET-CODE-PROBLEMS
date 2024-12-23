/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> que=new LinkedList<>();
        boolean[] visit=new boolean[100001];
        List<Integer> list;
        int cnt=0;


        // Initialize BFS
        visit[root.val]=true;
        que.add(root);
        while(!que.isEmpty()){
            
            Queue<TreeNode> tmpQ=new LinkedList<>(); 
            tmpQ.addAll(que); //Maintaining temp Queue for storing next level nodes into "que"
            que.clear(); 

            list=new ArrayList(); //Storing list of nodes for the same level 
            while(!tmpQ.isEmpty()){
                TreeNode node=tmpQ.poll();
                if( node.left!=null && !visit[node.left.val] ){
                    visit[node.left.val]=true;
                    que.add(node.left);
                    list.add(node.left.val);
                }
                if( node.right!=null && !visit[node.right.val] ){
                    visit[node.right.val]=true;
                    que.add(node.right);
                    list.add(node.right.val);
                }
            }
            cnt+=minNoOperations(list); //Finding the minimum operations for strictly increasing order
        }


        return cnt;
    }


    int minNoOperations(List<Integer> list){
        int cnt=0;
        List<Integer> listSort=new ArrayList();
        Map<Integer, Integer> map=new HashMap();

        //Storing Hash(key, value) for list-value and list-index
        for(int i=0; i<list.size(); i++){
            map.put(list.get(i), i);
        }

        listSort.addAll(list);
        Collections.sort(listSort); //Having sorted list into variable "listSort"

        //Comparing "list" with "sortedList" and swapping with help of "map"
        for(int i=0; i<list.size(); i++){
            if(list.get(i)!=listSort.get(i)){
                int idxS=i;
                int idxT=map.get(listSort.get(i));

                Collections.swap(list, idxS, idxT); //Swapping the values between idxS and idxT
                map.put(list.get(idxS), idxS); //Updating "map" value for idxS
                map.put(list.get(idxT), idxT); //Updating "map" value for idxT

                cnt++;
            }
        }

        
        return cnt;
    }

}