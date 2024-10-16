package com.jbk.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PaymentAdvice {

    // Define the pointcut with correct parameter names and types
    @Pointcut("execution(* com.jbk.service.PaymentService.doPayment(..)) && args(fromAcc, toAcc, amount)")
    public void p1(String fromAcc, String toAcc, double amount) {
        // This method is a dummy and just defines the pointcut
    }

    // Before advice with matching parameters
    @Before("p1(fromAcc, toAcc, amount)")
    public void initiatePayment(String fromAcc, String toAcc, double amount) {
        System.out.println("Initiated & Checked: fromAcc=" + fromAcc + ", toAcc=" + toAcc + ", amount=" + amount);
    }

    public void paymentDone() {
        System.out.println("Payment completed");
    }
    
    @AfterThrowing(pointcut = "p1(fromAcc, toAcc, amount)", throwing = "ex")
    public void paymentIssue(String fromAcc, String toAcc, double amount, RuntimeException ex) {
        System.out.println("Invalid Amount: " + ex.getMessage());
    }
}
