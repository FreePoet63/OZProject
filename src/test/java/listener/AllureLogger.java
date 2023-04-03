package listener;

import org.apache.logging.log4j.*;

public abstract class AllureLogger {
    private static final Logger Log =  LogManager.getLogger(AllureLogger.class);

    public static void info (String message) {
        Log.info(message);
    }

    public static void warn (String message) {
        Log.warn(message);
    }

    public static void error (String message) {
        Log.error(message);
    }

    public static void fatal (String message) {
        Log.fatal(message);
    }

    public static void debug (String message) {
        Log.debug(message);
    }
}
