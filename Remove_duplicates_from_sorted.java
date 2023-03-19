/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        ListNode temp=head;
        while(temp!=null){
                if(map.containsKey(temp.val)){
                    map.put(temp.val,2);
                }else{
                    map.put(temp.val,1);
                }
                list.add(temp.val);
                temp=temp.next;
        }
        for(int i=0;i<list.size();i++){
            if(map.get(list.get(i))>1){
                list.add(i,-101);
                list.remove(i+1);
            }
        }
        if(list.isEmpty()){
            return null;
        }
        if(list.get(0)==-101){
            while(!list.isEmpty() && list.get(0)==-101){
                list.remove(0);
            }
        }
        if(list.isEmpty()){
            return null;
        }
       ListNode ans=new ListNode(list.get(0));
       ListNode copy=ans;
       
       for(int i=1;i<list.size();i++){
           if(list.get(i)==-101){
               continue;
           }
           copy.next=new ListNode(list.get(i));
           copy=copy.next;
       }

        return ans;
    }
}