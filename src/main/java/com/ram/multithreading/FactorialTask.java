package com.ram.multithreading;

import java.util.concurrent.Callable;

public class FactorialTask implements Callable<Long> {

  private final int number;

  public FactorialTask(final int number) {
    this.number = number;
  }

  @Override
  public Long call() throws Exception {
    System.out.println(" Thread - " + Thread.currentThread().getName());
    final long result = FactorialTask.computeFact(this.number);
    Thread.sleep(20000);
    System.out.println(Thread.currentThread().getName() + " - result - " + result);
    return result;
  }

  private static long
  computeFact(final int number) {

    if (number == 0 || number == 1) {
      return 1;
    } else {
      return number * computeFact(number - 1);
    }
  }
}
