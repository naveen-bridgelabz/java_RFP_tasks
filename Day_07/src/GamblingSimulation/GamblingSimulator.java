package GamblingSimulation;

public class GamblingSimulator {

    static final int STAKE = 100;

    static final int BET = 1;

    static final int WIN_LIMIT = 150;

    static final int LOSS_LIMIT = 50;

    public static void main(String[] args) {

        int cash = STAKE;

        while (cash > LOSS_LIMIT && cash < WIN_LIMIT) {

            int random = (int) (Math.random() * 2);

            if (random == 1) {

                cash += BET;

            } else {

                cash -= BET;
            }
        }

        if (cash == WIN_LIMIT) {

            System.out.println("Gambler reached Winning Limit");

        } else {

            System.out.println("Gambler reached Losing Limit");
        }

        System.out.println("Final Cash: $" + cash);
    }
}