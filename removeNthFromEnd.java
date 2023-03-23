class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = new ListNode();
        temp = head;
        int len = 0;

       // calcular o tamanho da linked list 
       while (temp != null){
           temp = temp.next;
           len++;
       }
       temp = head;
       if(len == 1 && n == 1){
           return null;
       }
       n = len - n - 1;

       if(n < 0){
           return head.next;
       }

       
       for(int i = 0 ; i < n ; i++){
           temp = temp.next;
       }
       temp.next = temp.next.next;
       return head;
    }
}
