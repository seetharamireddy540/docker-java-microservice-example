package com.ram.multithreading;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialTaskTest {

  @Test
  public void call() throws Exception {

    System.out.println("Main Thread - " + Thread.currentThread().getName());
    final ExecutorService executorService = Executors.newFixedThreadPool(1);

    final FactorialTask factorialTask = new FactorialTask(10);
    final Future<Long> result = executorService.submit(factorialTask);
    System.out.println(result.get());

  }
}