package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.service.PaymentService;

@RestController
public class Test {
	@Autowired
	private PaymentService service;
	
	@GetMapping("/payment/{fromAcc}/{toAcc}/{amount}")
	public String doPayment(@PathVariable String fromAcc,@PathVariable String toAcc,@PathVariable double amount) {
		
		// initiate and checks payment
		// sucess msg
		// error msg
		
	String msg=	service.doPayment(fromAcc, toAcc, amount);
		return msg;
		
	}

}
