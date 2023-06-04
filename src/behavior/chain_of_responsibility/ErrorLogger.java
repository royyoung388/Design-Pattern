package behavior.chain_of_responsibility;

public class ErrorLogger extends AbstractLogger{

    public ErrorLogger() {
        level = ERROR;
    }
    @Override
    protected void write(String message) {
        System.out.println("ERROR: " + message);
    }
}
