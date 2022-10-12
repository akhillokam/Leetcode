class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null ||head.next==null){
            return head;
        }

        int n;
        ListNode oldTail = head;
        for(n=1;oldTail.next!=null; n++){
            oldTail = oldTail.next;
        }

        k %= n;
        oldTail.next = head;

        ListNode newTail = head;
        for(int i=1;i<n-k;i++){
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
        
    }
}