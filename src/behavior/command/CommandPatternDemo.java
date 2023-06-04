package behavior.command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Broker broker = new Broker();
        StockDB stockDB = new StockDB();

        broker.addCommand(new BuyStockCommand(stockDB));
        broker.addCommand(new SellStockCommand(stockDB));

        broker.commit();
    }
}
