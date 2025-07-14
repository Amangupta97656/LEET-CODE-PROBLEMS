class Solution {
    public int getDecimalValue(ListNode head) {
        int number=0;
        while(head!=null){
            number=(number<<1)| head.val;
            head=head.next;
        }
        return number;
    }
}