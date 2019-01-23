package com.ram.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class DelayedQueueConsumer implements Runnable {

  private final BlockingQueue<DelayedData> queue;

  private final int numberOfElementsToTake;

  private final AtomicInteger numberOfConsumedElements = new AtomicInteger();

  public DelayedQueueConsumer(final BlockingQueue<DelayedData> queue, final int numberOfElementsToTake) {
    this.queue = queue;
    this.numberOfElementsToTake = numberOfElementsToTake;
  }

  public AtomicInteger getNoOfConsumedElements() {
    return this.numberOfConsumedElements;
  }

  @Override
  public void run() {
    for (int i = 0; i < this.numberOfElementsToTake; i++) {
      try {
        final DelayedData object = this.queue.take();
        this.numberOfConsumedElements.incrementAndGet();
        System.out.println("Consumer take: " + object);
      } catch (final InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
