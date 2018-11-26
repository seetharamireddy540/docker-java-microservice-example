package com.ram.jsonconverters;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

public class CustomerAddress {

  @JsonProperty("AddressType")
  @JacksonXmlProperty(isAttribute = true , localName = "AddressType")
  private AddressType addressType;

  @JsonProperty("StreetName")
  private String streetName;

  @JsonProperty("City")
  private String city;

  @JsonProperty("ZIP-CODE")
  private String zipCode;

  public CustomerAddress() {
  }

  public CustomerAddress(final AddressType addressType, final String streetName,
                         final String city, final String zipCode) {
    this.addressType = addressType;
    this.streetName = streetName;
    this.city = city;
    this.zipCode = zipCode;
  }

  public AddressType getAddressType() {
    return addressType;
  }

  public String getStreetName() {
    return streetName;
  }

  public String getCity() {
    return city;
  }

  public String getZipCode() {
    return zipCode;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (!(o instanceof CustomerAddress)) return false;
    final CustomerAddress that = (CustomerAddress) o;
    return getAddressType() == that.getAddressType() &&
                   Objects.equals(getStreetName(), that.getStreetName()) &&
                   Objects.equals(getCity(), that.getCity()) &&
                   Objects.equals(getZipCode(), that.getZipCode());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getAddressType(), getStreetName(), getCity(), getZipCode());
  }

  @Override
  public String toString() {
    return "CustomerAddress{" +
                   "addressType=" + addressType +
                   ", streetName='" + streetName + '\'' +
                   ", city='" + city + '\'' +
                   ", zipCode='" + zipCode + '\'' +
                   '}';
  }
}
