package HashTableProblem;

public class MyHashTable<K, V> {

    private final int size = 10;

    private final MyMapNode<K, V>[] buckets;

    @SuppressWarnings("unchecked")
    public MyHashTable() {

        buckets = new MyMapNode[size];
    }

    private int getBucketIndex(K key) {

        return Math.abs(key.hashCode()) % size;
    }

    public void add(K key, V value) {

        int bucketIndex =
                getBucketIndex(key);

        MyMapNode<K, V> head =
                buckets[bucketIndex];

        while (head != null) {

            if (head.key.equals(key)) {

                head.value = value;

                return;
            }

            head = head.next;
        }

        MyMapNode<K, V> newNode =
                new MyMapNode<>(key, value);

        newNode.next =
                buckets[bucketIndex];

        buckets[bucketIndex] =
                newNode;
    }

    public V get(K key) {

        int bucketIndex =
                getBucketIndex(key);

        MyMapNode<K, V> head =
                buckets[bucketIndex];

        while (head != null) {

            if (head.key.equals(key)) {

                return head.value;
            }

            head = head.next;
        }

        return null;
    }

    public void remove(K key) {

        int bucketIndex =
                getBucketIndex(key);

        MyMapNode<K, V> head =
                buckets[bucketIndex];

        MyMapNode<K, V> previous =
                null;

        while (head != null) {

            if (head.key.equals(key)) {

                if (previous == null) {

                    buckets[bucketIndex] =
                            head.next;

                } else {

                    previous.next =
                            head.next;
                }

                return;
            }

            previous = head;

            head = head.next;
        }
    }

    public void display() {

        for (int i = 0; i < size; i++) {

            MyMapNode<K, V> temp =
                    buckets[i];

            while (temp != null) {

                System.out.println(
                        temp.key
                                + " : "
                                + temp.value
                );

                temp = temp.next;
            }
        }
    }
}