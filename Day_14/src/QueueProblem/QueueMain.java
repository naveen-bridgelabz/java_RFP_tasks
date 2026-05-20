package QueueProblem;

public class QueueMain {

    public static void main(String[] args) {

        Queue<Integer> queue =
                new Queue<>();

        queue.enqueue(56);

        queue.enqueue(30);

        queue.enqueue(70);

        System.out.println(
                "\nQueue Elements"
        );

        queue.display();

        System.out.println(
                "\nDequeued : "
                        + queue.dequeue()
        );

        queue.display();
    }
}