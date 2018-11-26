package com.ram.jsonconverters;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MyXMLParser {

  public static void main(String arg[]) {

    System.out.println("Staring ...");

    MyXMLParser myXMLParser = new MyXMLParser();
    myXMLParser.convertJavaToJSON();
    myXMLParser.convertJavaToXML();
    myXMLParser.convertXMLtoJava();

    System.out.println("Conversion is done ....");
  }


  private void convertJavaToJSON() {
    ObjectMapper mapper = new ObjectMapper();
    Staff staff = getStaff();


    try {
      // Convert object to JSON string
      String jsonInString = mapper.writeValueAsString(staff);
      System.out.println(jsonInString);


    } catch (JsonProcessingException ex) {
      ex.printStackTrace();
    }

  }

  private Staff getStaff() {

    Map<String, Integer> wivesMap = new HashMap<>();
    wivesMap.put("Gita", 1);
    wivesMap.put("Pita", 2);

    Staff staff = new Staff();
    staff.setName("Ram");
    staff.setAge(24);
    staff.setSalary(new BigDecimal(123454L));
    staff.setSkills(Arrays.asList("Java", "GO"));
    staff.setPosition("Developer");


    staff.setWivesCount(wivesMap);
    return staff;
  }

  private void convertJavaToXML() {

    try {

      XmlMapper xmlMapper = new XmlMapper();
      String stafXML = xmlMapper.writeValueAsString(getStaff());
      System.out.println(stafXML);

    } catch (Exception ex) {

    }
  }


  private Staff convertXMLtoJava() {
    Staff staff = null;
    try {

      File file = new File(getClass().getClassLoader().getResource("StaffData.xml").getFile());
      XmlMapper xmlMapper = new XmlMapper();
      staff = xmlMapper.readValue(file, Staff.class);
      System.out.println("done ... staff - " + staff.getName());
    } catch (Exception ex) {

      ex.printStackTrace();
    }
    return staff;
  }
}
