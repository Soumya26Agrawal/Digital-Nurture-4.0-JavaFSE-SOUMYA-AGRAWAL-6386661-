package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void main(String[] args) {
		LOGGER.info("START");
		SpringApplication.run(SpringLearnApplication.class, args);
		LOGGER.info("END");

	}
}

// Purpose of @SpringBootApplication

//Equivalent To:
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan

//It tells Spring Boot to:
//
//		a) Auto-configure beans
//
//		b) Scan packages
//
//		c) Start the application

