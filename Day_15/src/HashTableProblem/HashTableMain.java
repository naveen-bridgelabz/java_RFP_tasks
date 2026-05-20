package HashTableProblem;

public class HashTableMain {

    public static void main(String[] args) {

        /*
         * UC1
         */
        String sentence =
                "To be or not to be";

        MyHashTable<String, Integer>
                hashTable =
                new MyHashTable<>();

        String[] words =
                sentence.toLowerCase()
                        .split(" ");

        for (String word : words) {

            Integer frequency =
                    hashTable.get(word);

            if (frequency == null) {

                hashTable.add(word, 1);

            } else {

                hashTable.add(
                        word,
                        frequency + 1
                );
            }
        }

        System.out.println(
                "\nUC1 Word Frequency"
        );

        hashTable.display();

        /*
         * UC2
         */
        String paragraph =
                "Paranoids are not paranoid because "
                        + "they are paranoid but because "
                        + "they keep putting themselves "
                        + "deliberately into paranoid "
                        + "avoidable situations";

        MyHashTable<String, Integer>
                paragraphTable =
                new MyHashTable<>();

        String[] paragraphWords =
                paragraph.toLowerCase()
                        .split(" ");

        for (String word : paragraphWords) {

            Integer frequency =
                    paragraphTable.get(word);

            if (frequency == null) {

                paragraphTable.add(word, 1);

            } else {

                paragraphTable.add(
                        word,
                        frequency + 1
                );
            }
        }

        System.out.println(
                "\nUC2 Paragraph Frequency"
        );

        paragraphTable.display();

        /*
         * UC3
         */
        paragraphTable.remove(
                "avoidable"
        );

        System.out.println(
                "\nUC3 After Removing 'avoidable'"
        );

        paragraphTable.display();
    }
}