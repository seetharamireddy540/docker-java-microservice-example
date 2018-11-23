package com.ram.reflection;

public class PaymentProcessApp {

  public static void main(String arg[]) {

    try {

      Class<?> c = Class.forName("com.ram.reflection.PaymentProcessorImpl");
      PaymentProcessor paymentProcessor = (PaymentProcessor) c.getDeclaredConstructor().newInstance();
      paymentProcessor.processPayment(new PaymentProcessorRequest());

    } catch (Exception ex) {
      ex.printStackTrace();
      System.out.println("Exception occurred while creating instance of payment processor");
    }

  }
}
