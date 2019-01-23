package com.ram;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class ExploreJavaDate {

  public static void main(final String[] arg) {

    final LocalDate localDate = LocalDate.now();
    System.out.println("Date - " + localDate.toString());
    System.out.println("Epoch Day " + localDate.toEpochDay());

    final Instant instant = Instant.now();
    System.out.println("Epoch Time in Sec - " + instant.getEpochSecond());
    System.out.println("Millis - " + instant.toEpochMilli());

    final LocalDate with = localDate.with(TemporalAdjusters.lastDayOfMonth());
    System.out.println("Last Day of month - " + with.toString());

    final LocalDate with2 = localDate.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
    System.out.println("Next THURSDAY - > " + with2.toString());
  }
}
