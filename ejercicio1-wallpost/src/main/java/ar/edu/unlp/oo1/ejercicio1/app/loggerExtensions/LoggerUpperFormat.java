package ar.edu.unlp.oo1.ejercicio1.app.loggerExtensions;
import java.util.logging.SimpleFormatter;

public class LoggerUpperFormat extends SimpleFormatter {
    @Override
    public String format(java.util.logging.LogRecord record) {
        return super.format(record).toUpperCase();
    }
}
