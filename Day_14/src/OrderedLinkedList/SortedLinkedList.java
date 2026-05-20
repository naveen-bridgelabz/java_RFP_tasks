package OrderedLinkedList;

class Node<T extends Comparable<T>> {

    T data;

    Node<T> next;

    public Node(T data) {

        this.data = data;
    }
}

public class SortedLinkedList<T extends Comparable<T>> {

    Node<T> head;

    public void add(T data) {

        Node<T> newNode =
                new Node<>(data);

        if (head == null
                || head.data.compareTo(data) > 0) {

            newNode.next = head;

            head = newNode;

            return;
        }

        Node<T> temp = head;

        while (temp.next != null
                && temp.next.data.compareTo(data) < 0) {

            temp = temp.next;
        }

        newNode.next = temp.next;

        temp.next = newNode;
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