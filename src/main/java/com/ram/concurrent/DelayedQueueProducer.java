package com.ram.concurrent;

import java.util.UUID;
import java.util.concurrent.BlockingQueue;

public class DelayedQueueProducer implements Runnable {

  private final BlockingQueue<DelayedData> queue;
  private final int noOfElementsToProduce;
  private final long delayOfProcessingMillis;

  public DelayedQueueProducer(final BlockingQueue<DelayedData> queue,
                              final int noOfMessage,
                              final long delayOfEachProducedMessageMilliseconds) {
    this.queue = queue;
    this.noOfElementsToProduce = noOfMessage;
    this.delayOfProcessingMillis = delayOfEachProducedMessageMilliseconds;
  }

  @Override
  public void run() {
    for (int i = 0; i < this.noOfElementsToProduce; i++) {
      final DelayedData delayedData = new DelayedData(UUID.randomUUID().toString(), this.delayOfProcessingMillis);
      System.out.println("put object - " + delayedData.toString());
      try {

        this.queue.put(delayedData);
        Thread.sleep(500);
      } catch (final Exception ex) {
        ex.printStackTrace();
      }

    }
  }
}
