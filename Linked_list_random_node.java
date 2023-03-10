class Solution {
    private ListNode head;
    private Random random;

    public Solution(ListNode head) {
        this.head = head;
        random = new Random();
    }

    public int getRandom() {
        int count = 0;
        int result = 0;
        ListNode curr = head;

        while (curr != null) {
            count++;
            if (random.nextInt(count) == 0) {
                result = curr.val;
            }
            curr = curr.next;
        }

        return result;
    }
}
