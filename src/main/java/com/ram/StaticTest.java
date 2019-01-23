package com.ram;

public class StaticTest {

  static {
    System.out.println("I am in Static");


  }

  {
    System.out.println(" Not in Static");
  }

  public static void main(final String[] args) {
    final StaticTest staticTest = new StaticTest();
    final StaticTest staticTest1 = new StaticTest();
    final StaticTest staticTest2 = new StaticTest();
  }
}
