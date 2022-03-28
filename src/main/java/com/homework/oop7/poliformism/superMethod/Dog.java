package com.homework.oop7.poliformism.superMethod;

public class Dog extends Pet {
  public static final String DOG = "Я люблю людей.";

  @Override
  public void printInfo(){
    super.printInfo();
    System.out.printf(DOG);
  }
}
