package com.homework.oop7.inheritance;

/**
 * Класс Person объявлен как абстрактный. Это значит, что мы не можем создавать его экземпляры.
 * Сделай из данного класса обычный, допиши недостающую логику, которая отвечает общепринятым подходам к инкапсуляции:
 * геттеры должны возвращать, а сеттеры — устанавливать значения соответствующим полям.
 * Требования:
 * •	Класс Person не должен быть абстрактным.
 * •	Метод getName() должен возвращать значение поля name.
 * •	Метод setName(String) должен устанавливать переданное значение полю name.
 * •	Метод getAge() должен возвращать значение поля age.
 * •	Метод setAge(int) должен устанавливать переданное значение полю age.
 */

public abstract class Person {
  private String name;
  private int age;

  public abstract String getName();

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public abstract void setAge(int age);
}
