class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next=null;
    }
}
class MyLinkedList {
    int size;
    Node temp;

    public MyLinkedList() {
        temp=new Node(-1);
        size=0;
    }
    
    public int get(int index) {
        if(index>=size){
            return -1;
        }

        Node curr=temp;
        for(int i=0;i<=index;i++){
            curr=curr.next;
        }
        return curr.data;
    }
    
    public void addAtHead(int val) {

        Node node=new Node(val);
        node.next=temp.next;
        temp.next=node;
        size++;
    }
    
    public void addAtTail(int val) {
        Node node=new Node(val);
        Node curr=temp;
        for(int i=0;i<size;i++){
            curr=curr.next;
        }
        curr.next=node;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        
        if(index>size) return;

        Node node=new Node(val);
        Node curr=temp;

        for(int i=0;i<index;i++){
            curr=curr.next;
        }
        node.next=curr.next;
        curr.next=node;
        size++;

    }
    
    public void deleteAtIndex(int index) {

        if(index>=size) return;
        Node curr=temp;

        for(int i=0;i<index;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        size--;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
