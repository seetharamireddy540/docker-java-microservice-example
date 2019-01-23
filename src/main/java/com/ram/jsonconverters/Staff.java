package com.ram.jsonconverters;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@JsonPropertyOrder({"name", "wives", "age", "salary", "position", "skills"})
@JsonRootName(value = "staff")
public class Staff {

  private String name;
  private int age;
  private String position;
  private BigDecimal salary;
  private List<String> skills;
  private Map<String, Integer> wivesCount;

  @JsonProperty("wives")
  public Map<String, Integer> getWivesCount() {
    return wivesCount;
  }

  public void setWivesCount(final Map<String, Integer> wives) {
    this.wivesCount = wives;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(final int age) {
    this.age = age;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(final String position) {
    this.position = position;
  }

  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(final BigDecimal salary) {
    this.salary = salary;
  }

  public List<String> getSkills() {
    return skills;
  }

  public void setSkills(final List<String> skills) {
    this.skills = skills;
  }
}
