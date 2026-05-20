package CommercialDataProcessing;

public class CompanyShares {

    String stockSymbol;

    int numberOfShares;

    String transactionDate;

    public CompanyShares(
            String stockSymbol,
            int numberOfShares,
            String transactionDate
    ) {

        this.stockSymbol = stockSymbol;

        this.numberOfShares = numberOfShares;

        this.transactionDate = transactionDate;
    }

    @Override
    public String toString() {

        return stockSymbol
                + " | Shares : "
                + numberOfShares
                + " | Date : "
                + transactionDate;
    }
}