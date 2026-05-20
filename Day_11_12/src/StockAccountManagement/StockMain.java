package StockAccountManagement;

public class StockMain {

    public static void main(String[] args) {

        StockPortfolio portfolio =
                new StockPortfolio();

        portfolio.addStock(
                new Stock(
                        "TCS",
                        100,
                        2500
                )
        );

        portfolio.addStock(
                new Stock(
                        "Infosys",
                        150,
                        1800
                )
        );

        portfolio.printStockReport();
    }
}