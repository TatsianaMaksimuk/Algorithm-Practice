package Day15;

public class LinkedListUS {
//Properties
    Node head;
    int count;

// constructors
//    public LinkedList(){
//        head = null;
//        count = 0;
//    }

    public LinkedListUS(Node newHead){
        head = newHead;
        count=1;
    }

//methods

    //add
    public void add(int newData){
    Node temp = new Node(newData);
    Node current = head;
    while (current.getNext()!=null){
        current = current.getNext();
    }
    current.setNext(temp);
    count++;
    }
    //get
    public int get(int index){
        if (index<=0){
            return -1;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }
    //size
    public int size(){
        return count;
    }
    //isEmpty
    public boolean isEmpty(){
        return head == null;
    }
    //remove from the back of the list
    //won't work for train that has only 1 car
    public void remove(){
        Node current = head;
        while (current.getNext().getNext() != null){
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }
}
