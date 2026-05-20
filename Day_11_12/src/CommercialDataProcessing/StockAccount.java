package CommercialDataProcessing;

import java.util.ArrayList;

public class StockAccount {

    ArrayList<CompanyShares> companyShares =
            new ArrayList<>();

    public void buy(
            String symbol,
            int shares,
            String date
    ) {

        companyShares.add(
                new CompanyShares(
                        symbol,
                        shares,
                        date
                )
        );

        System.out.println(
                shares + " Shares Bought"
        );
    }

    public void sell(
            String symbol,
            int shares
    ) {

        for (CompanyShares company
                : companyShares) {

            if (company.stockSymbol.equals(symbol)
                    && company.numberOfShares >= shares) {

                company.numberOfShares -= shares;

                System.out.println(
                        shares + " Shares Sold"
                );

                return;
            }
        }

        System.out.println(
                "Not Enough Shares"
        );
    }

    public void displayShares() {

        for (CompanyShares company
                : companyShares) {

            System.out.println(company);
        }
    }
}