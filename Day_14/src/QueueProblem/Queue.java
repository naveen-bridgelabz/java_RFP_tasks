package QueueProblem;

import java.util.LinkedList;

public class Queue<T> {

    LinkedList<T> queue =
            new LinkedList<>();

    /*
     * UC3
     */
    public void enqueue(T data) {

        queue.addLast(data);
    }

    /*
     * UC4
     */
    public T dequeue() {

        return queue.removeFirst();
    }

    public void display() {

        System.out.println(queue);
    }
}