package BST;

public class BSTMain {

    public static void main(String[] args) {

        BinarySearchTree<Integer>
                bst =
                new BinarySearchTree<>();

        /*
         * UC1
         */

        bst.add(56);

        bst.add(30);

        bst.add(70);

        System.out.println(
                "\nUC1 BST"
        );

        bst.inorder();

        /*
         * UC2
         */
        bst.add(22);

        bst.add(40);

        bst.add(60);

        bst.add(95);

        bst.add(11);

        bst.add(65);

        bst.add(3);

        bst.add(16);

        bst.add(63);

        bst.add(67);

        System.out.println(
                "\nUC2 Tree Size : "
                        + bst.size()
        );

        System.out.println(
                "\nInorder Traversal"
        );

        bst.inorder();

        /*
         * UC3
         */
        boolean found =
                bst.search(63);

        System.out.println(
                "\nSearching 63 : "
                        + found
        );
    }
}