package com.ram.concurrent;

import com.google.common.primitives.Ints;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedData implements Delayed {
  private final String data;
  private final long startTime;

  public DelayedData(final String data, final long delayInMilli) {
    this.data = data;
    this.startTime = System.currentTimeMillis() + delayInMilli;
  }

  @Override
  public long getDelay(final TimeUnit unit) {
    final long diff = System.currentTimeMillis() - this.startTime;
    return unit.convert(diff, TimeUnit.MILLISECONDS);
  }

  @Override
  public int compareTo(final Delayed o) {
    return Ints.saturatedCast(this.startTime - ((DelayedData) o).startTime);
  }

  @Override
  public String toString() {
    return "DelayedData{" +
        "data='" + this.data + '\'' +
        ", startTime=" + this.startTime +
        '}';
  }
}
