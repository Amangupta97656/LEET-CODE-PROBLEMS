public class Solution {
    public boolean hasCycle(ListNode headNode) {
        ListNode fastPointer = headNode;
        ListNode slowPointer = headNode;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(slowPointer == fastPointer) {
            return true;
            }
        }
        return false;
    }
}