package Day18;

import java.util.LinkedList;
import java.util.Stack;

public class QueueStacks {
    LinkedList<Character> queue = new LinkedList<>();

    Stack<Character> stack = new Stack<>();

    public void pushCharacter(char ch){
        stack.push(ch);
    }

    public char popCharacter(){
       return stack.pop();
    }

    public void enqueueCharacter(char ch){
        queue.addLast(ch);
    }

    public char dequeueCharacter(){
       return queue.removeFirst();
    }

}
