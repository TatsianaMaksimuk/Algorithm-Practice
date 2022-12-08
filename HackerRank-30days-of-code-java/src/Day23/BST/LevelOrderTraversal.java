package Day23.BST;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LevelOrderTraversal {

    static void levelOrder(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root); //adding root node to the queue
        while (queue.peek() != null) { //before executing we check if there is anything in the queue, there is node root
            Node node = queue.remove(); // removing the next node from the queue
            System.out.println(node.data + " "); // processing the node we just removed
            if (node.left!=null) queue.add(node.left);
            if (node.right!=null) queue.add(node.right);
        }

    }


    public static void main(String[] args) {

    }
}
