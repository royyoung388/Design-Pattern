package behavior.chain_of_responsibility;

public abstract class AbstractLogger {
    public static final int INFO = 0;
    public static final int DEBUG = 1;
    public static final int ERROR = 2;

    protected int level;

    private AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);
}
