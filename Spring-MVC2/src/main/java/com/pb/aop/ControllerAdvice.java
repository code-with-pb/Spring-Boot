package com.pb.aop;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ControllerAdvice {
	
	private Logger log = LoggerFactory.getLogger(ControllerAdvice.class);
	
	@Pointcut(" execution (* com.pb.controller.*.*(..))")
	public void logs() {
		
	}
	
	@Before("logs()")
	public void startAt() {
		String time = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss:SSS").format(new Date());
		
		log.info("Started At: "+time);
	}
	@AfterReturning("logs()")
	public void endedAt() {
		String time = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss:SSS").format(new Date());
		
		log.info("Ended At: "+time);
	}
}
