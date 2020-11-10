package ro.training.java.c08._06log_level;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionLogLevelDemo {

    public static void main(String[] args) {
        System.out.println("Ceva normal");
        System.err.println("Ceva grav");

        /**
         * In the case of other logger (Log4J, java.util.logging.Logger),
         * we have multiple log levels
         */

        Logger logger = Logger.getLogger(ExceptionLogLevelDemo.class.getName());
        logger.fine("fine message");
        logger.info("info message");
        logger.warning("warning message");
        logger.severe("severe message");

    }
}
