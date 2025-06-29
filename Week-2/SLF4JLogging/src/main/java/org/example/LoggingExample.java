package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.info("Starting application...");

        String username = "admin";
        String passwordInput = "wrongpass"; // simulated input

        logger.debug("Checking credentials for user: {}", username);

        if (!"admin123".equals(passwordInput)) {
            logger.warn("Login attempt failed for user: {}", username);
            logger.error("Authentication error: Invalid password");
        } else {
            logger.info("User {} logged in successfully.", username);
        }

        logger.info("Shutting down application...");
    }
}
