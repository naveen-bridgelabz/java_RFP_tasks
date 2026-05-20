package AccountManagement;

public class AccountTest {

    public static void main(String[] args) {

        Account account =
                new Account(5000);

        System.out.println(
                "Current Balance : "
                        + account.getBalance()
        );

        account.debit(2000);

        System.out.println(
                "Updated Balance : "
                        + account.getBalance()
        );

        account.debit(4000);
    }
}