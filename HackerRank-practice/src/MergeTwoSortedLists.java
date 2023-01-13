public class MergeTwoSortedLists {
    public static Node merge(Node head1, Node head2) {
        Node left = head1;
        Node right = head2;

        // Choosing the new head
        Node newHead = new Node();
        if (left.data < right.data) {
            newHead.data = left.data;
            left = left.next;
        } else {
            newHead.data = right.data;
            right = right.next;
        }

        Node currentNode = newHead;

        while (left != null || right != null) {
            currentNode.next = new Node();
            currentNode = currentNode.next;

            if (left == null) {
                currentNode.data = right.data;
                right = right.next;
            } else if (right == null) {
                currentNode.data = left.data;
                left = left.next;
            } else if (left.data < right.data) {
                currentNode.data = left.data;
                left = left.next;
            } else {
                currentNode.data = right.data;
                right = right.next;
            }
        }

        return newHead;
    }
}
