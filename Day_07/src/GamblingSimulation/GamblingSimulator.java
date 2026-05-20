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

    public static void gambleForMonth() {

        int maxWin = Integer.MIN_VALUE;

        int maxLoss = Integer.MAX_VALUE;

        int luckiestDay = 0;

        int unluckiestDay = 0;

        for (int day = 1; day <= DAYS; day++) {

            int result = gambleForDay();

            if (result > maxWin) {

                maxWin = result;

                luckiestDay = day;
            }

            if (result < maxLoss) {

                maxLoss = result;

                unluckiestDay = day;
            }
        }

        System.out.println("Luckiest Day: "
                + luckiestDay);

        System.out.println("Unluckiest Day: "
                + unluckiestDay);
    }

    public static void main(String[] args) {

        gambleForMonth();
    }
}