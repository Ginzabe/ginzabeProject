package utilities;


import org.apache.logging.log4j.LogManager;

public class Logger {

    // Create a Logger instance
    private static org.apache.logging.log4j.Logger logger = LogManager.getLogger(Logger.class);

    public void someMethod() {
        // Log messages at different levels
        logger.info("This is an info message");
        logger.error("This is an error message");
        logger.debug("This is a debug message");
    }

    public static void main(String[] args) {
    	Logger obj = new Logger();
        obj.someMethod();
    }
}