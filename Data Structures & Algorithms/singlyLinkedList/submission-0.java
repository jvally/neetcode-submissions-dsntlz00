class ListNode {//singly linked list node
    int val;//inital value
    ListNode next;//next node

    public ListNode(int val){
        this(val, null);//sets next pointer to null as its currently pointing to nth by default

    }
    public ListNode(int val, ListNode next){
        this.val = val;//set value of current node
        this.next = next;//set value of next node
    }

}


class LinkedList {
    private ListNode head;
    private ListNode tail;

    public LinkedList() {
        this.head = new ListNode(-1);//initalising linklist and dummynode
        this.tail = this.head;//tail points to the head 
    }

    public int get(int index) {//recursively go down the linked list 
        int i = 0;
        ListNode curr = head.next;
        while(curr != null){//if LL not empty or havent rch end
            if(i == index){
                return curr.val;//return "head" of list
            }
            i++;//increment the index
            curr = curr.next;//point to the tail
        }
        return -1;
    }

    public void insertHead(int val) {
        //if list not empty
        ListNode newNode = new ListNode(val);//create a new node
        newNode.next = head.next;
        head.next = newNode;//set dummy.next to new head
        if(newNode.next == null){//if list is empty
            tail = newNode;//tail of dummy points to the new node
        }

    }

    public void insertTail(int val) {
        //same concept but insert at end
        //since tail is pointing to null => make tail point to new node n next of new node points to null
        this.tail.next = new ListNode(val);
        this.tail = this.tail.next;

    }
    //remove a index => removing the index w/o data loss
    public boolean remove(int index) {
        ListNode curr = this.head;
        int i = 0;
        while(i < index && curr != null){
           i++;
           curr = curr.next;
        }
        if(curr != null && curr.next!= null){//checks if its the last element
            if(curr.next == this.tail){
                this.tail = curr;
            }
            curr.next = curr.next.next;//point to the element the remove element was pointing to 
            return true;
        }
        return false;
        
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> res = new ArrayList<>();
        ListNode curr = this.head.next;
        while(curr != null){
            res.add(curr.val);
            curr = curr.next;
        }
        return res;
    }
}
