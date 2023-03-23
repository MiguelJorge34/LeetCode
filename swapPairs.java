class Solution {
    public ListNode swapPairs(ListNode head) {
      if(head == null || head.next == null){
          return head;
      }
      ListNode nextNextNode = head.next.next;
      ListNode nextNode = head.next;
      ListNode node = head;

      head = nextNode;
      head.next = node;

      head.next.next = swapPairs(nextNextNode);

      return head; 
    }
}
