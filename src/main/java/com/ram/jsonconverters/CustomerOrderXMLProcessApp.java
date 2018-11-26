package com.ram.jsonconverters;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;

public class CustomerOrderXMLProcessApp {

  public static void main(String[] args) {

    try {

      XmlMapper mapper = new XmlMapper();
//
//      mapper.enable(SerializationFeature.INDENT_OUTPUT);
//      mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
//      CustomerOrderInfo customerOrderInfo = new CustomerOrderInfo("Order-Number-123");
//
//      CustomerOrderInfos customerOrderInfos = new CustomerOrderInfos("Web", customerOrderInfo);
//      CustomerOrder customerOrder = new CustomerOrder("2018-11-23", customerOrderInfos);
//
//
//     String customerOrderXMLStr = mapper.writeValueAsString(customerOrder);
//      System.out.println(customerOrderXMLStr);

      File file = new File(CustomerOrderXMLProcessApp.class.getClassLoader()
                                     .getResource("CustomerOrder123.xml").getFile());

      CustomerOrder customerOrder = mapper.readValue(file,  CustomerOrder.class);

      System.out.println(customerOrder.getCreateDate());

      System.out.println(customerOrder.getCustomerAddress().getAddressType());

      System.out.println(customerOrder.getCustomerAddress().getCity());


    }catch (Exception ex ) {
      ex.printStackTrace();
    }
  }
}
