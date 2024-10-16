package com.jbk.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AOP_CLass {
	
	@Pointcut("execution (* com.jbk.controller.*.*(..)")
	public void p1() {
		
	}
	
}
