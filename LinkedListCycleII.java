public class Solution {
    public ListNode detectCycle(ListNode head) {

        if(head == null){
            return null;

        }

        ListNode fast = head.next;
        ListNode slow = head;


        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                break;
            }

        }

        if(fast != slow){
            return null;
        }


        fast = head;

        slow = slow.next;

        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
        
    }
}
