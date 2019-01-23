package com.ram.reflection;

public class PaymentProcessorImpl implements PaymentProcessor {

    @Override
    public PaymentProcessorResponse processPayment(final PaymentProcessorRequest request) {
        System.out.println("Processing payment..");
        final PaymentProcessorResponse response = new PaymentProcessorResponse();
        response.setStatus(true);
        System.out.println("Processing payment..is done");
        return response;
    }
}
