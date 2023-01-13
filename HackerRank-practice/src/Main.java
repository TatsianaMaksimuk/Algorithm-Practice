public class Main {
    public static void main(String[] args) {
        Node left = new Node();
        left.data = 2;
        left.next = new Node();
        left.next.data = 5;
        left.next.next = new Node();
        left.next.next.data = 6;

        Node right = new Node();
        right.data = 1;
        right.next = new Node();
        right.next.data = 3;
        right.next.next = new Node();
        right.next.next.data = 4;
        right.next.next.next = new Node();
        right.next.next.next.data = 7;


        Node mergedList = MergeTwoSortedLists.merge(left, right);

        while(mergedList != null) {
            System.out.println(mergedList.data);
            mergedList = mergedList.next;
        }
    }
}