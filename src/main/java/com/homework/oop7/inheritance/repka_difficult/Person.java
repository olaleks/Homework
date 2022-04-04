package com.homework.oop7.inheritance.repka_difficult;

public class Person {
  private String name;
  private String namePadezh;

  public Person(String name, String namePadezh) {
    this.name = name;
    this.namePadezh = namePadezh;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNamePadezh() {
    return namePadezh;
  }

  public void setNamePadezh(String namePadezh) {
    this.namePadezh = namePadezh;
  }

  public void pull(Person second) {

    System.out.println(name + " за " + second.getNamePadezh());
  }
}
