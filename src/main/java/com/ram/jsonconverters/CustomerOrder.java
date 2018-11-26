package com.ram.jsonconverters;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.io.Serializable;

@JsonRootName("CustomerOrder")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerOrder implements Serializable {

  @JacksonXmlProperty(isAttribute=true)
  @JsonProperty("CreateDate")
  @JsonIgnoreProperties(ignoreUnknown=true)
  private String createDate;

  @JsonProperty("CustomerOrderInfos")
  @JsonIgnoreProperties(ignoreUnknown=true)
  private CustomerOrderInfos customerOrderInfos;

  @JsonProperty("CustomerAddress")
  @JsonIgnoreProperties(ignoreUnknown = true)
  private CustomerAddress customerAddress;

  public String getCreateDate() {
    return createDate;
  }

  public CustomerOrderInfos getCustomerOrderInfos() {
    return customerOrderInfos;
  }

  public CustomerAddress getCustomerAddress() {
    return customerAddress;
  }

  public CustomerOrder() {
  }

  public CustomerOrder(final String createDate, final CustomerOrderInfos customerOrderInfos, final CustomerAddress customerAddress) {
    this.createDate = createDate;
    this.customerOrderInfos = customerOrderInfos;
    this.customerAddress = customerAddress;
  }
}
