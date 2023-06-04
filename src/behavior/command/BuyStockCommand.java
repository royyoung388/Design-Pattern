package behavior.command;

public class BuyStockCommand implements Command{
    private StockDB stockDB;

    public BuyStockCommand(StockDB stockDB) {
        this.stockDB = stockDB;
    }

    @Override
    public void execute() {
        stockDB.buy();
    }
}
