package StackProblem;

import java.util.LinkedList;

public class Stack<T> {

    LinkedList<T> stack =
            new LinkedList<>();

    /*
     * UC1
     */
    public void push(T data) {

        stack.push(data);
    }

    /*
     * UC2
     */
    public T peek() {

        return stack.peek();
    }

    public T pop() {

        return stack.pop();
    }

    public boolean isEmpty() {

        return stack.isEmpty();
    }

    public void display() {

        System.out.println(stack);
    }
}