package DeckOfCardsQueue;

import java.util.Random;

public class DeckOfCardsQueue {

    public static void main(String[] args) {

        String[] suits = {
                "Clubs",
                "Diamonds",
                "Hearts",
                "Spades"
        };

        String[] ranks = {
                "2", "3", "4", "5",
                "6", "7", "8", "9",
                "10", "Jack",
                "Queen", "King", "Ace"
        };

        String[] deck = new String[52];

        int index = 0;

        for (String suit : suits) {

            for (String rank : ranks) {

                deck[index++] =
                        rank + " of " + suit;
            }
        }

        Random random = new Random();

        for (int i = 0; i < deck.length; i++) {

            int randomCard =
                    random.nextInt(deck.length);

            String temp = deck[i];

            deck[i] = deck[randomCard];

            deck[randomCard] = temp;
        }

        Player[] players = {
                new Player("Player 1"),
                new Player("Player 2"),
                new Player("Player 3"),
                new Player("Player 4")
        };

        index = 0;

        for (Player player : players) {

            for (int i = 0; i < 9; i++) {

                player.cardsQueue.enqueue(
                        deck[index++]
                );
            }
        }

        for (Player player : players) {

            player.displayCards();
        }
    }
}