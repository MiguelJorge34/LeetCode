public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = size(headA);
        int sizeB = size(headB);

        int diferenceSize = Math.abs(sizeA - sizeB);
        
        if(sizeA > sizeB){
            for(int i = 0; i < diferenceSize; i++){
                headA = headA.next;
            }
        }
        if(sizeA < sizeB){
            for(int i = 0; i < diferenceSize; i++){
                headB = headB.next;
            }
        }
        while(headA != null && headB !=null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
    public int size(ListNode node){
        
        int size = 0;
        while(node != null){
            size++;
            node = node.next;
        }
        return size;
    }
}
