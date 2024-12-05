package lab5.adapter;

public class LoggerAdapter implements Logger{
    private External_logger externalLogger;

    public LoggerAdapter(External_logger externalLogger) {
        this.externalLogger = externalLogger;
    }

    @Override
    public void log(String messg) {
        externalLogger.logmes(messg); // Адаптируем метод
    }
}

