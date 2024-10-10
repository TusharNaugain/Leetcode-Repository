class MyLinkedList {
    List<Integer> list;
    public MyLinkedList() {
        list = new ArrayList<>();
    }
    
    public int get(int index) {
        if(index>=list.size()) return -1;
        return list.get(index);
    }
    
    public void addAtHead(int val) {
        list.add(0,val);
    }
    
    public void addAtTail(int val) {
        list.add(val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index>list.size()) return;
        index = Math.max(0, index);
        list.add(index,val);
    }
    
    public void deleteAtIndex(int index) {
        if(list.size()>index) list.remove(index);
    }
}