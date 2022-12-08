package Day24;

import java.util.HashMap;
import java.util.HashSet;

public class LinkedListNodeRemoval {
    public static Node removeDuplicates(Node head) {

        HashSet<Integer> set = new HashSet<Integer>();

        Node current = head;

        while (current.next != null){
            set.add(current.data);
            Node next = current.next;
            if (set.contains(next.data)){
                current.next = next.next;
            }else {
                current = next;
            }
        }
        return head;
    }
}
