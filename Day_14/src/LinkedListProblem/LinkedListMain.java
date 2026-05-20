package LinkedListProblem;

import OrderedLinkedList.SortedLinkedList;

public class LinkedListMain {

    public static void main(String[] args) {

        /*
         * UC1
         */
        LinkedList<Integer> list =
                new LinkedList<>();

        list.add(70);

        list.add(30);

        list.add(56);

        System.out.println(
                "\nUC1 & UC2"
        );

        list.display();

        /*
         * UC3
         */
        LinkedList<Integer> appendList =
                new LinkedList<>();

        appendList.append(56);

        appendList.append(30);

        appendList.append(70);

        System.out.println(
                "\nUC3"
        );

        appendList.display();

        /*
         * UC4
         */
        LinkedList<Integer> insertList =
                new LinkedList<>();

        insertList.append(56);

        insertList.append(70);

        Node<Integer> node =
                insertList.search(56);

        insertList.insertAfter(node, 30);

        System.out.println(
                "\nUC4"
        );

        insertList.display();

        /*
         * UC5
         */
        insertList.pop();

        System.out.println(
                "\nUC5"
        );

        insertList.display();

        /*
         * UC6
         */
        appendList.popLast();

        System.out.println(
                "\nUC6"
        );

        appendList.display();

        /*
         * UC7
         */
        Node<Integer> foundNode =
                appendList.search(30);

        System.out.println(
                "\nUC7 Search Result : "
                        + foundNode.data
        );

        /*
         * UC8
         */
        appendList.insertAfter(
                foundNode,
                40
        );

        System.out.println(
                "\nUC8"
        );

        appendList.display();

        /*
         * UC9
         */
        appendList.delete(40);

        System.out.println(
                "\nUC9"
        );

        appendList.display();

        System.out.println(
                "Size : "
                        + appendList.size()
        );

        /*
         * UC10
         */
        SortedLinkedList<Integer> sortedList =
                new SortedLinkedList<>();

        sortedList.add(56);

        sortedList.add(30);

        sortedList.add(40);

        sortedList.add(70);

        System.out.println(
                "\nUC10"
        );

        sortedList.display();
    }
}