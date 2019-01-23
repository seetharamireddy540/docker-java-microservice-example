package com.ram.concurrent;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DelayedDataTest {

  @Test
  public void testDelayedQueue() throws Exception {

    final ExecutorService executorService = Executors.newFixedThreadPool(2);
    final BlockingQueue<DelayedData> queue = new DelayQueue<>();

    final int noOfMessage = 2;
    final long delayOfEachProducedMessageMilliseconds = 500;

    final DelayedQueueProducer delayedQueueProducer = new DelayedQueueProducer(queue, noOfMessage,
        delayOfEachProducedMessageMilliseconds);


    final DelayedQueueConsumer delayedQueueConsumer = new DelayedQueueConsumer(queue, noOfMessage);

    executorService.submit(delayedQueueProducer);
    executorService.submit(delayedQueueConsumer);

    executorService.awaitTermination(5, TimeUnit.SECONDS);

    Assert.assertEquals(2, delayedQueueConsumer.getNoOfConsumedElements().get());
  }
}