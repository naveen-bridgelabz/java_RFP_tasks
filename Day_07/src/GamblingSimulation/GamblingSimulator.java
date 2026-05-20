package GamblingSimulation;

public class GamblingSimulator {

    static final int STAKE = 100;

    static final int BET = 1;

    static final int WIN_LIMIT = 150;

    static final int LOSS_LIMIT = 50;

    static final int DAYS = 20;

    public static int gambleForDay() {

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

    public static int gambleForMonth() {

        int totalAmount = 0;

        for (int day = 1; day <= DAYS; day++) {

            totalAmount += gambleForDay();
        }

        return totalAmount;
    }

    public static void continueGambling() {

        int month = 1;

        while (true) {

            int totalAmount = gambleForMonth();

            System.out.println("Month "
                    + month
                    + " Amount: $"
                    + totalAmount);

            if (totalAmount > 0) {

                System.out.println(
                        "Continue Gambling"
                );

            } else {

                System.out.println(
                        "Stop Gambling"
                );

                break;
            }

            month++;
        }
    }

    public static void main(String[] args) {

        continueGambling();
    }
}