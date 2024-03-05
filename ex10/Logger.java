package ex10;

public interface Logger {
    void logMessage(int level, String message);

    void setNextLogger(Logger nextLogger);
}