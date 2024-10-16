package com.jbk.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	
	public String doPayment(String fromAcc, String toAcc, double amount) {
		
		if(amount>0) {
			return "payment done";
		}else {
			throw new RuntimeException("Something went wrong");
		}
		
	}

}
