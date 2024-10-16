package com.pb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvc2Application {
	
	private static Logger log = LoggerFactory.getLogger(SpringMvc2Application.class);
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringMvc2Application.class, args);
		
		log.info("Process Started...");
	}

}
