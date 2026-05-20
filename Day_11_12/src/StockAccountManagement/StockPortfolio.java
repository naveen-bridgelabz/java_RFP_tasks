package StockAccountManagement;

import java.util.ArrayList;

public class StockPortfolio {

    ArrayList<Stock> stocks =
            new ArrayList<>();

    public void addStock(Stock stock) {

        stocks.add(stock);
    }

    public void printStockReport() {

        double totalValue = 0;

        System.out.println("\nStock Report");

        for (Stock stock : stocks) {

            double stockValue =
                    stock.calculateStockValue();

            totalValue += stockValue;

            System.out.println(
                    stock.stockName
                            + " Value : "
                            + stockValue
            );
        }

        System.out.println(
                "\nTotal Stock Value : "
                        + totalValue
        );
    }
}