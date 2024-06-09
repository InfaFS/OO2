package ar.edu.unlp.oo1.ejercicio1.app.loggerExtensions;
import java.util.logging.Formatter;
import java.util.logging.Logger;
public class JsonFormat extends Formatter {
    @Override
    public String format(java.util.logging.LogRecord record) {
        return "{ \"message\": \"" + record.getMessage() + "\", \"level\": \"" + record.getLevel() + "\" }\n";
    }
    
}
