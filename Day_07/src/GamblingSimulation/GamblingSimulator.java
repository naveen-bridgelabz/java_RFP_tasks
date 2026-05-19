package GamblingSimulation;

public class GamblingSimulator {

    static final int STAKE = 100;

    static final int BET = 1;

    static final int WIN_LIMIT = 150;

    static final int LOSS_LIMIT = 50;

    static final int DAYS = 20;

    public static int playForDay() {

        int cash = STAKE;

        while (cash > LOSS_LIMIT && cash < WIN_LIMIT) {

            int random = (int) (Math.random() * 2);

            if (random == 1) {

                cash += BET;

            } else {

                cash -= BET;
            }
        }

        return cash - STAKE;
    }

    public static void main(String[] args) {

        int totalAmount = 0;

        for (int day = 1; day <= DAYS; day++) {

            totalAmount += playForDay();
        }

        System.out.println("Total Amount After 20 Days: $"
                + totalAmount);
    }
}