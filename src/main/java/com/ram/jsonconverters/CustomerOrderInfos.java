package com.ram.jsonconverters;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.io.Serializable;
import java.util.Objects;

public class CustomerOrderInfos implements Serializable {

  @JacksonXmlProperty(isAttribute = true)
  @JsonProperty("Channel")
  private String channel;

  @JsonProperty("CustomerOrderInfo")
  private CustomerOrderInfo customerOrderInfo;

  public CustomerOrderInfos() {
  }

  public CustomerOrderInfos(final String channel, final CustomerOrderInfo customerOrderInfo) {
    this.channel = channel;
    this.customerOrderInfo = customerOrderInfo;
  }

  public String getChannel() {
    return channel;
  }

  public CustomerOrderInfo getCustomerOrderInfo() {
    return customerOrderInfo;
  }

  @Override
  public String toString() {
    return "CustomerOrderInfos{" +
                   "channel='" + channel + '\'' +
                   ", customerOrderInfo=" + customerOrderInfo +
                   '}';
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (!(o instanceof CustomerOrderInfos)) return false;
    final CustomerOrderInfos that = (CustomerOrderInfos) o;
    return Objects.equals(getChannel(), that.getChannel()) &&
                   Objects.equals(getCustomerOrderInfo(), that.getCustomerOrderInfo());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getChannel(), getCustomerOrderInfo());
  }
}
