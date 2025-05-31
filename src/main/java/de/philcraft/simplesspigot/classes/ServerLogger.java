package de.philcraft.simplesspigot.classes;

import org.bukkit.Bukkit;
import java.util.logging.Handler;
import java.util.logging.Logger;

/**
 * Utility class for simplified server logging.
 * Provides static methods for various log levels
 * and allows adding custom log handlers.
 */
public class ServerLogger {

    private static final Logger logger = Bukkit.getLogger();

    /**
     * Logs a warning message.
     *
     * @param msg The warning message to log.
     */
    public static void warn(String msg) {
        logger.warning(msg);
    }

    /**
     * Logs an informational message.
     *
     * @param msg The info message to log.
     */
    public static void info(String msg) {
        logger.info(msg);
    }

    /**
     * Logs a severe error message.
     *
     * @param msg The severe error message to log.
     */
    public static void severe(String msg) {
        logger.severe(msg);
    }

    /**
     * Logs a configuration message.
     *
     * @param msg The config message to log.
     */
    public static void config(String msg) {
        logger.config(msg);
    }

    /**
     * Logs a fine-grained informational message.
     *
     * @param msg The fine message to log.
     */
    public static void fine(String msg) {
        logger.fine(msg);
    }

    /**
     * Logs a finer-grained informational message.
     *
     * @param msg The finer message to log.
     */
    public static void finer(String msg) {
        logger.finer(msg);
    }

    /**
     * Adds a custom log handler.
     *
     * @param handler The handler to add.
     */
    public static void addHandler(Handler handler) {
        logger.addHandler(handler);
    }

    /**
     * Logs a message at the specified log level.
     * Supported types: INFO, WARN (or WARNING), SEVERE.
     * Defaults to INFO for unknown types.
     *
     * @param type The log level as a string.
     * @param msg  The message to log.
     */
    public static void log(String type, String msg) {
        switch (type.toUpperCase()) {
            case "INFO":
                logger.info(msg);
                break;
            case "WARN":
            case "WARNING":
                logger.warning(msg);
                break;
            case "SEVERE":
                logger.severe(msg);
                break;
            default:
                logger.info(msg);
                break;
        }
    }
}
