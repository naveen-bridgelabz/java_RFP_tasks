package CommercialDataProcessing;

public class StockAccountMain {

    public static void main(String[] args) {

        StockAccount stockAccount =
                new StockAccount();

        stockAccount.buy(
                "TCS",
                100,
                "2026-05-20"
        );

        stockAccount.buy(
                "INFY",
                50,
                "2026-05-20"
        );

        stockAccount.sell(
                "TCS",
                20
        );

        stockAccount.displayShares();
    }
}