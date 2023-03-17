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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null && slow != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null){
            slow = slow.next;
        }
        slow = reverseList(slow);
        fast = head;
        

        while(slow != null && fast != null){
            if (slow.val != fast.val) return false;
            slow = slow.next;
            fast = fast.next;

        }
        return true;
    }
    private ListNode reverseList(ListNode head){
        ListNode newNode = null;

        while(head != null){
            ListNode next = head.next;
            head.next = newNode;
            newNode = head;
            head = next;
        }
        return newNode;
    }
}
