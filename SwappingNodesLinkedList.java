
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode firstNode = getNthElement(head,k);
        ListNode secondNode = getNthElement(head,getSize(head)-k+1);
        swapNodes(firstNode,secondNode);

        return head;
    }




    private int getSize(ListNode head){
        int size = 0;
        while(head != null){
            head = head.next;
            size++;
        }
        return size;
    }

    
    
    
    private ListNode getNthElement(ListNode head, int k){
        
        while(--k > 0){
            head = head.next;
        }

        return head;
    }

    private void swapNodes(ListNode first , ListNode second){
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }


}
