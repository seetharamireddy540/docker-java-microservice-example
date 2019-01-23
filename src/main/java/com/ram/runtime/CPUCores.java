package com.ram.runtime;

public class CPUCores {

  public static void main(final String[] arg) {
    final int noOfProcessor = Runtime.getRuntime().availableProcessors();
    System.out.println("available processors - " + noOfProcessor);
  }
}
