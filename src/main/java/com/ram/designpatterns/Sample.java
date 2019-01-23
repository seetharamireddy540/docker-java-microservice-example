package com.ram.designpatterns;

public enum Sample {
  INSTANCE;
  int i;

  private Sample() {

  }

  public int show() {
    System.out.println(" i value - " + this.i);
    return this.i;
  }
}
