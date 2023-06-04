package behavior.command;

public class SellStockCommand implements Command {
    private StockDB stockDB;

    public SellStockCommand(StockDB stockDB) {
        this.stockDB = stockDB;
    }

    @Override
    public void execute() {
        stockDB.sell();
    }
}
