package GamblingSimulation;

public class GamblingSimulator {

    static final int STAKE = 100;

    static final int BET = 1;

    public static void main(String[] args) {

        int cash = STAKE;

        int random = (int) (Math.random() * 2);

        if (random == 1) {

            cash += BET;

            System.out.println("Gambler Won $1");

        } else {

            cash -= BET;

            System.out.println("Gambler Lost $1");
        }

        System.out.println("Remaining Cash: $" + cash);
    }
}