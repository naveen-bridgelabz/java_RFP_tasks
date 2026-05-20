package BST;

public class BinarySearchTree<T extends Comparable<T>> {

    BSTNode<T> root;

    /*
     * UC1
     */
    public void add(T data) {

        root = addRecursive(
                root,
                data
        );
    }

    private BSTNode<T> addRecursive(
            BSTNode<T> current,
            T data
    ) {

        if (current == null) {

            return new BSTNode<>(data);
        }

        if (data.compareTo(current.data) < 0) {

            current.left =
                    addRecursive(
                            current.left,
                            data
                    );

        } else if (
                data.compareTo(current.data) > 0
        ) {

            current.right =
                    addRecursive(
                            current.right,
                            data
                    );
        }

        return current;
    }

    /*
     * UC2
     */
    public int size() {

        return sizeRecursive(root);
    }

    private int sizeRecursive(
            BSTNode<T> node
    ) {

        if (node == null) {

            return 0;
        }

        return 1
                + sizeRecursive(node.left)
                + sizeRecursive(node.right);
    }

    /*
     * UC3
     */
    public boolean search(T key) {

        return searchRecursive(
                root,
                key
        );
    }

    private boolean searchRecursive(
            BSTNode<T> current,
            T key
    ) {

        if (current == null) {

            return false;
        }

        if (current.data.equals(key)) {

            return true;
        }

        if (key.compareTo(current.data) < 0) {

            return searchRecursive(
                    current.left,
                    key
            );
        }

        return searchRecursive(
                current.right,
                key
        );
    }

    public void inorder() {

        inorderRecursive(root);

        System.out.println();
    }

    private void inorderRecursive(
            BSTNode<T> node
    ) {

        if (node != null) {

            inorderRecursive(node.left);

            System.out.print(
                    node.data + " "
            );

            inorderRecursive(node.right);
        }
    }
}