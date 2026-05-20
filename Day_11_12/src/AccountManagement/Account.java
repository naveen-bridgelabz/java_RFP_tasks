package AccountManagement;

public class Account {

    private double balance;

    public Account(double balance) {

        if (balance > 0) {

            this.balance = balance;
        }
    }

    public double getBalance() {

        return balance;
    }

    public void debit(double amount) {

        if (amount <= balance) {

            balance -= amount;

            System.out.println(
                    "Debited : "
                            + amount
            );

        } else {

            System.out.println(
                    "Debit amount exceeded account balance"
            );
        }
    }
}