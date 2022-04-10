package com.homework.lambda_stream12.comparator;

public class Student {
  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Студент - " + name +
        ", возраст - " + age +
        '.';
  }
}
