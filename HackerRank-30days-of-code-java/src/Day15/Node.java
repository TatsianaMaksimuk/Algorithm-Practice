package Day15;

public class Node {
    //Properties
    Node next;
    int data;

    //Methods

    //Constructors
    public Node(int newData) {
        data = newData;
        next = null;
    }

    public Node(int newData, Node newNext) {
        data = newData;
        next=newNext;
    }

    //Getters and Setters


    public int getData() {
        return data;
    }

    public Node getNext(){
        return next;
    }

    public void setData(int newData){
        data = newData;
    }

    public void setNext(Node newNode){
        next = newNode;
    }


    public static  Node insert(Node head,int data) {
        //Complete this method
        Node toBeInserted = new Node(data);
        if (head ==null) {

            head = toBeInserted;

        }else{
            Node current = head;
            while (current.next!=null){
                current = current.next;
            }
            current.next = toBeInserted;

        }
        return head;
    }
}
