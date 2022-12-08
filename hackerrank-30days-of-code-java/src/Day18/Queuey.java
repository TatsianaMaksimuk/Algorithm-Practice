package Day18;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Stack;

public class Queuey<D> { //D means whatever we declare it to be

    LinkedList<D> queue;
    //making queue instance;

    public Queuey() {
        queue = new LinkedList<>();
    }

    //Checking if our queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    //What is a queue size;
    public int size() {
        return queue.size();
    }

    //enqueueing an item, adding it to the end of the list
    public void enqueue(D s) {
        queue.addLast(s);
    }

    //dequeuing an item
    public D dequeue() {
        return  queue.remove(0); //we're casting here, we can use .removeFirst
    }

    //peek at the first item
    public D peek() {
        return queue.get(0);
        //return (String) queue.get(0); //casting. we can use .peek()
    }


    public static void main(String[] args) {

        //For int

     Queuey numberQueue = new Queuey();
        numberQueue.enqueue(2);
     numberQueue.enqueue(5);
    numberQueue.enqueue(6);
        System.out.println("Peek at first: " + numberQueue.peek());
       System.out.println("First out: " + numberQueue.dequeue());
      System.out.println("Peek at second, now first: " + numberQueue.peek());
        System.out.println("Second out: " + numberQueue.dequeue());
        System.out.println("Third out: " + numberQueue.dequeue());


        //For String
        Queuey stringQueue = new Queuey();
        stringQueue.enqueue("Hi");
        stringQueue.enqueue("there");
        System.out.print(stringQueue.dequeue() + ", ");
        System.out.println(stringQueue.dequeue() + " ");


        //Stacks

        Stack<String> stacky = new Stack<>(); //good practice to state datatype
        stacky.push("there");
        stacky.push("hi, ");
        System.out.println(stacky.size());
        System.out.println(stacky.peek()); //returns object at the top of stack
        System.out.print(stacky.pop() + " ");
        System.out.println(stacky.pop() + "!");

    }
}
