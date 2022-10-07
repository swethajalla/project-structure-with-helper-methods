import ch.qos.logback.classic.LoggerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Provides logging functionality to classes implementing this interface
 * No need to overwrite the default implementation
 * @author Swetha
 */
public interface Loggable {
    /**
     * Get Logger instance
     * @return Logger instance
     */
    default Logger log(){

        return LoggerFactory.getLogger(this.getClass());

    }

    default String getLogDir(){

        LoggerContext context = (LoggerContext)LoggerFactory.getILoggerFactory();
        return context.getProperty("logBaseDir");
    }

}
