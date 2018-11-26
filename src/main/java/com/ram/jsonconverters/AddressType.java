package com.ram.jsonconverters;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum AddressType {
  HOME,
  OFFICE;
}
