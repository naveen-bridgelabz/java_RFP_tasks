package LinkedListProblem;

public class LinkedList<T extends Comparable<T>> {

    Node<T> head;

    Node<T> tail;

    /*
     * UC1 & UC2
     */
    public void add(T data) {

        Node<T> newNode =
                new Node<>(data);

        if (head == null) {

            head = tail = newNode;

        } else {

            newNode.next = head;

            head = newNode;
        }
    }

    /*
     * UC3
     */
    public void append(T data) {

        Node<T> newNode =
                new Node<>(data);

        if (head == null) {

            head = tail = newNode;

        } else {

            tail.next = newNode;

            tail = newNode;
        }
    }

    /*
     * UC4
     */
    public void insertAfter(
            Node<T> previousNode,
            T data
    ) {

        if (previousNode == null) {

            return;
        }

        Node<T> newNode =
                new Node<>(data);

        newNode.next =
                previousNode.next;

        previousNode.next =
                newNode;
    }

    /*
     * UC5
     */
    public void pop() {

        if (head != null) {

            head = head.next;
        }
    }

    /*
     * UC6
     */
    public void popLast() {

        if (head == null) {

            return;
        }

        if (head == tail) {

            head = tail = null;

            return;
        }

        Node<T> temp = head;

        while (temp.next != tail) {

            temp = temp.next;
        }

        tail = temp;

        tail.next = null;
    }

    /*
     * UC7
     */
    public Node<T> search(T key) {

        Node<T> temp = head;

        while (temp != null) {

            if (temp.data.equals(key)) {

                return temp;
            }

            temp = temp.next;
        }

        return null;
    }

    /*
     * UC9
     */
    public void delete(T key) {

        if (head == null) {

            return;
        }

        if (head.data.equals(key)) {

            head = head.next;

            return;
        }

        Node<T> temp = head;

        while (temp.next != null
                && !temp.next.data.equals(key)) {

            temp = temp.next;
        }

        if (temp.next != null) {

            temp.next = temp.next.next;
        }
    }

    /*
     * UC9
     */
    public int size() {

        int count = 0;

        Node<T> temp = head;

        while (temp != null) {

            count++;

            temp = temp.next;
        }

        return count;
    }

    public void display() {

        Node<T> temp = head;

        while (temp != null) {

            System.out.print(
                    temp.data + " -> "
            );

            temp = temp.next;
        }

        System.out.println("null");
    }
}