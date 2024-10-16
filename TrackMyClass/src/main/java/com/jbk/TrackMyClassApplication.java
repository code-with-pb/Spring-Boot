package com.jbk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrackMyClassApplication {

	static Logger log = LoggerFactory.getLogger(TrackMyClassApplication.class);
	
	public static void main(String[] args) {
		log.info("Application Started..!!");
		SpringApplication.run(TrackMyClassApplication.class, args);
	}

}
