package behavior.chain_of_responsibility;

public class ConsoleLogger extends AbstractLogger{
    public ConsoleLogger() {
        level = INFO;
    }

    @Override
    protected void write(String message) {
        System.out.println("CONSOLE: " + message);
    }
}
