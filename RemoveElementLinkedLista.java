class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(-1);
        temp.next = head;

        ListNode curr = head;
        ListNode prev = temp;
        
        while(curr != null){

            if (curr.val == val){
                prev.next = curr.next;

            }
            else{
                prev = curr;
            }
            curr = curr.next;
        }
        return temp.next;
    }
}
