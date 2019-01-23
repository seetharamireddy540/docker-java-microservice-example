package com.ram.designpatterns;

public class SingletonDemo {

  public static void main(final String[] args) {
    final Sample sample = Sample.INSTANCE;
    sample.i = 10;
    System.out.println(sample.show());
    sample.i = 15;
    System.out.println(sample.show());

    String TRANSIENT_ERROR_NAME = "Test";

    System.out.println(TRANSIENT_ERROR_NAME.indexOf("Test"));
  }
}
