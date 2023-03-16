class MyLinkedList {
   class Node{
        int val;
        Node next;
    }
    Node head;
    public MyLinkedList() {
        this.head = null;
    }
    
    
    public int get(int index) {
        Node temp = this.head;
        for(int i = 0; i < index; i++){
            if(temp == null){
                return -1;
            }
            temp = temp.next;
        }
        if(temp == null){
            return -1;
        }
        return temp.val;
        
    }
    
    public void addAtHead(int val) {
            Node node = new Node();
        node.val = val;
        node.next = this.head;
        this.head = node;
        
    }
    
    public void addAtTail(int val) {
        Node node = new Node();
        node.val = val;
        if(this.head == null){
            node.next = this.head;
            this.head = node;
        }
        else{
            Node temp = this.head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index == 0){
            addAtHead(val);
        }
        else{
            Node node = new Node();
            node.val = val;
            Node temp = this.head;
            
            for(int i = 0; i < index - 1 ; i++){
                if (temp == null){
                    return;
                }
                temp = temp.next;
            }
            if (temp == null){
                    return;
            }
            node.next = temp.next;
            temp.next = node;
                
            }
        }
        
    
    
    public void deleteAtIndex(int index) {
        if(this.head == null){
            return;
        }
        if(index == 0){
            this.head =this.head.next;
            return;
        }
        Node temp = this.head;
        for(int i = 0; i < index-1 ; i++){
            if(temp== null){
                return;
            }
            temp = temp.next;
            
        }
        if(temp==null){return;}
        if(temp.next != null){temp.next = temp.next.next;}
    }
}
