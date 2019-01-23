package com.ram.jsonconverters;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.io.Serializable;
import java.util.Objects;

public class CustomerOrderInfo implements Serializable {

  @JsonProperty("OrderNumebr")
  @JacksonXmlProperty(isAttribute = true)
  private String orderNumber;

  public CustomerOrderInfo() {
  }

  public CustomerOrderInfo(final String orderNumber) {
    this.orderNumber = orderNumber;
  }

  public String getOrderNumber() {
    return orderNumber;
  }

  @Override
  public String toString() {
    return "CustomerOrderInfo{" +
                   "orderNumber='" + orderNumber + '\'' +
                   '}';
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (!(o instanceof CustomerOrderInfo)) return false;
    final CustomerOrderInfo that = (CustomerOrderInfo) o;
    return Objects.equals(getOrderNumber(), that.getOrderNumber());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getOrderNumber());
  }
}
