package DeckOfCardsQueue;

public class Player {

    String playerName;

    Queue cardsQueue;

    public Player(String playerName) {

        this.playerName = playerName;

        cardsQueue = new Queue();
    }

    public void displayCards() {

        System.out.println(
                "\n" + playerName
        );

        cardsQueue.display();
    }
}