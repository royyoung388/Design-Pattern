package behavior.chain_of_responsibility;

public class FileLogger extends AbstractLogger{

    public FileLogger() {
        level = DEBUG;
    }

    @Override
    protected void write(String message) {
        System.out.println("FILE: " + message);
    }
}
