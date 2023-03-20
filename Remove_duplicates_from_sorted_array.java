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
        ListNode temp1=head;
        ListNode temp2=head;
        if(head==null){
            return head;
        }
        while(temp2.next!=null){

            temp2=temp2.next;
            if(temp1.val!=temp2.val){
                temp1.next=temp2;
                temp1=temp1.next;
            }
        }
        temp1.next=null;
        return head;
       
    }
}