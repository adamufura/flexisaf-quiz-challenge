package com.flexisaf.flexisafquiz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlexisafquizApplication {
    private static final Logger logger = LoggerFactory.getLogger(FlexisafquizApplication.class);

    public static void main(String[] args) {
		SpringApplication.run(FlexisafquizApplication.class, args);
//        logger.debug("Debug log message");
//        logger.info("Info log message");
//        logger.error("Error log message");
	}

}
