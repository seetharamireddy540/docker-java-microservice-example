package com.ram.reflection;

public enum Olive {

  GREEN("green"), RED("red");

  private String oliveColor;

  private Olive(final String oliveColor) {
    this.oliveColor = oliveColor;
  }

  public String getOliveColor() {
    return oliveColor;
  }
}
