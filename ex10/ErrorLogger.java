package ex10;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.err.println("Error Console::Logger: " + message);
    }
}
