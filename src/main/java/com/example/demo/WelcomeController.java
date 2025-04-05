package com.example.demo;

import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.Query;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class WelcomeController {
    /**
     * In Spring by default we can use these modules for Logging. Java Util Logging, Log4J2, Logback
     * By Default Logback used for logging. However Logback routing was included Java Util Logging, Log4J2
     * TRACE < DEBUG < INFO < WARN < ERROR < FATAL  - if you place info in application logs, debug and trace logs wont print.
     */

    private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);
    @GetMapping("/welcome")
    public String hello() {
        logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warn message");
        logger.error("Error message");

        return "welcome......";
    }


}
