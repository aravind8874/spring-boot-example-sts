package com.javatpoint;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //// similar to @Configuration @EnableAutoConfiguration
						//// @ComponentScan
public class SpringBootExampleSts {
	static Logger logger = LoggerFactory.getLogger(SpringBootExampleSts.class);
	
	@PostConstruct
	public void init()
	{
		logger.info("Spring boot started");
	}

	public static void main(String[] args) {
		logger.info("Spring boot executed......");
		SpringApplication.run(SpringBootExampleSts.class, args);
	}
}