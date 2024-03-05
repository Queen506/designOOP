package ex10;

public class main {
    private static Logger getChainOfLoggers() {
        Logger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        Logger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        Logger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        Logger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}
