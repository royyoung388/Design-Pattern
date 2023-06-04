package behavior.chain_of_responsibility;

public class ChainPatternDemo {
    public static void main(String[] args) {
        AbstractLogger console = new ConsoleLogger();
        AbstractLogger error = new ErrorLogger();
        AbstractLogger file = new FileLogger();

        console.setNextLogger(error);
        error.setNextLogger(file);

        console.logMessage(AbstractLogger.ERROR, "TEST");
    }
}
